package com.example.auditservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuditController {

    @GetMapping("/audit/status")
    public String status() {
        return "Audit service is up and running!";
    }
}
