package com.wani.mailpdf.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Service("EmailService")
public class EmailServiceImpl implements EmailService {

    private static final String NOREPLY_ADDRESS = "oen142@naver.com";


    private final JavaMailSender emailSender;
    private final SimpleMailMessage template;
    private final SpringTemplateEngine thymeleafTemplateEngine;
    private final FreeMarkerConfigurer freeMarkerConfigurer;
    private final Resource resourceFile;


}
