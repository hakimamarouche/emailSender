package org.example.service;

import org.example.pojo.JsonEmail;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(JsonEmail email) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp-mail.outlook.com");
        mailSender.setPort(587);

        mailSender.setUsername(email.getEmailAddress());
        mailSender.setPassword(email.getPassword());

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(email.getName() + " <" + email.getEmailAddress() + ">");
        message.setTo(email.getTo());
        message.setSubject(email.getSubject());
        message.setText(email.getMessageBody());
        mailSender.send(message);
    }
}
