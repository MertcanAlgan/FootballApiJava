package org.example.tahmiinbackend.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class MailConfig {

    @Autowired
    private Environment env;

    @Bean
    public JavaMailSender javaMailSender(){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtppro.zoho.com");
        mailSender.setPort(587);
        mailSender.setUsername("destek@tahmiin.com");
        mailSender.setPassword("MertCan_00");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        return mailSender;
    }
}
