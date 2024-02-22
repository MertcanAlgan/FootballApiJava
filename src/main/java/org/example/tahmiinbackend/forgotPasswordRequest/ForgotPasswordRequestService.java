package org.example.tahmiinbackend.forgotPasswordRequest;

import org.example.tahmiinbackend.config.JwtService;
import org.example.tahmiinbackend.mail.EmailSenderService;
import org.example.tahmiinbackend.user.User;
import org.example.tahmiinbackend.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ForgotPasswordRequestService {
    @Autowired
    private JwtService jwtService;

    @Autowired
    private EmailSenderService emailSenderService;
    private final ForgotPasswordRequestRepository forgotPasswordRequestRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public ForgotPasswordRequestService(ForgotPasswordRequestRepository forgotPasswordRequestRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.forgotPasswordRequestRepository = forgotPasswordRequestRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public void processForgotPasswordRequest(String userEmail){
        if (userEmail != null) {
            ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(userEmail,null);

            String forgotPasswordRequestToken = jwtService.generateTokenForForgotPassword(forgotPasswordRequest);

            forgotPasswordRequest.setForgotPasswordRequestToken(forgotPasswordRequestToken);

            forgotPasswordRequestRepository.save(forgotPasswordRequest);

            emailSenderService.sendForgotPasswordEmail(userEmail, forgotPasswordRequestToken);
        } else {
            System.out.println("E-posta adresi null olarak gönderildi.");
        }
    }
    public void changePasswordForgot(Long userId, String newPassword) {
        Optional<User> optionalUser = userRepository.findUserByUserId(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            String encodedPassword = passwordEncoder.encode(newPassword);
            user.setPassword(encodedPassword);
            userRepository.save(user);
        }else {
            throw new IllegalStateException(userId + " böyle bir user bulunmuyor");
        }
    }
}
