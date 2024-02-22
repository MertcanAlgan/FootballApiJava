package org.example.tahmiinbackend.mail;

import org.example.tahmiinbackend.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    private final UserService userService;

    public EmailSenderService(UserService userService) {
        this.userService = userService;
    }

    public void sendActivationEmail(String toEmail) {
        Optional<Long> userIdOptional = userService.getUserIdByUserEmail(toEmail);

        if (userIdOptional.isPresent()) {
            Long userId = userIdOptional.get();
            String activationLink = "http://localhost:3000/register/user/kayıt-tamamla/" + userId;

            String subject = "Hoş geldiniz! Hesabınızı Aktifleştirin";
            String body = "Merhaba,\n\n"
                    + "Hoş geldiniz! Hesabınızı aktifleştirmek için aşağıdaki linke tıklayabilirsiniz:\n\n"
                    + activationLink + "\n\n"
                    + "İyi günler dileriz!";

            sendEmail(toEmail, subject, body);
        } else {
            System.out.println("User not found with email: " + toEmail);
        }
    }

    public void sendForgotPasswordEmail(String toEmail, String forgotPasswordRequestToken) {
        Optional<Long> userIdOptional = userService.getUserIdByUserEmail(toEmail);
        if (userIdOptional.isPresent()){
            Long userId = userIdOptional.get();
            String forgotPasswordLink = "http://localhost:3000/sifremi-unuttum/" + forgotPasswordRequestToken + "/user/" + userId;

            String subject = "Şifre Sıfırlama Talebi";
            String body = "Merhaba,\n\n"
                    + "Şifrenizi sıfırlamak için aşağıdaki linke tıklayabilirsiniz\n\n"
                    + forgotPasswordLink + "\n\n"
                    + "İyi günler dileriz!";

            sendEmail(toEmail, subject, body);
        } else {
            System.out.println("User not found with email: " + toEmail);
        }
    }

    private void sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("destek@tahmiin.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        javaMailSender.send(message);
        System.out.println("Mail sent");
    }
}
