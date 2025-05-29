package com.hcl.TestProject1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.TestProject1.service.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
    private final PatientService service;

    PatientController(PatientService service) {
        this.service = service;
    }
}