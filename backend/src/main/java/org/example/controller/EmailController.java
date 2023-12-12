package org.example.controller;

import org.example.pojo.JsonEmail;
import org.example.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/email")
    public void sendEmail(@RequestBody JsonEmail request) {
        emailService.sendEmail(request);
    }
}

