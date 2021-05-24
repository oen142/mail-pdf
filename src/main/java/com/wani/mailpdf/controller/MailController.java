package com.wani.mailpdf.controller;

import com.wani.mailpdf.service.EmailService;
import org.springframework.stereotype.Controller;

@Controller
public class MailController {

    private final EmailService emailService;

    public MailController(EmailService emailService) {
        this.emailService = emailService;
    }
}
