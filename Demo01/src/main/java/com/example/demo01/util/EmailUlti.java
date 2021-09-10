package com.example.demo01.ulti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.persistence.Column;

@Component
public class EmailUlti {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String diaChiDen, String tieuDe, String noiDung) {
        MimeMessage message = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(diaChiDen);
            helper.setSubject(tieuDe);
            helper.setText(noiDung);

            mailSender.send(message);
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

