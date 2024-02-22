package org.example.tahmiinbackend.user;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public void userApprove(Long userId){
        boolean exists = userRepository.existsById(userId);
        if (!exists){
            throw new IllegalStateException(userId + "Böyle bir user yok");
        }
        try {
            userRepository.approveUser(userId);
        } catch (Exception e){
            throw new IllegalStateException("User Approve edilemiyor", e);
        }
    }

    public Optional<Long> getUserIdByUserEmail(String userEmail) {
        Optional<User> optionalUser = userRepository.findUserByUserEmail(userEmail);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return Optional.of(user.getUserId());
        } else {
            return Optional.empty();
        }
    }

    public void changePasswordByUserId(Long userId, String newPassword) {
        Optional<User> optionalUser = userRepository.findUserByUserId(userId);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            String encryptedPassword = passwordEncoder.encode(newPassword);
            user.setPassword(encryptedPassword);
            userRepository.save(user);
        } else {
            throw new IllegalStateException(userId + " böyle bir user bulunmuyor");
        }
    }
}
