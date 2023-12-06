package org.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @PostMapping("/send-email")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public void sendEmail() {
        // Your logic to send emails here
    }
}

