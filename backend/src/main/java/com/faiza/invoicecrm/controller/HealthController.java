package com.faiza.invoicecrm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "B2B Invoice CRM API is running";
    }

    @GetMapping("/api/health")
    public String health() {
        return "Backend is healthy";
    }
}