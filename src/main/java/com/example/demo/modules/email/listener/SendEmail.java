package com.example.demo.modules.email.listener;

import com.example.demo.modules.cobros.events.CobrosEvents;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SendEmail {
    private final JavaMailSender mailSender;

    @EventListener
    @Async("asyncExecutor")
    public void sendMessage(CobrosEvents cobrosEvents) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setTo(cobrosEvents.getTo());
        helper.setFrom("info@starbox.com.py");
        helper.setSubject("🌟 Confirma tu registro en Starbox");

        helper.setText(cobrosEvents.getText() + "\n" + cobrosEvents.getCobros());
        mailSender.send(message);
    }
}
