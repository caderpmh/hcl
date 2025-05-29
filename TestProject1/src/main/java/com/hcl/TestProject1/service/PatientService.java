package com.hcl.TestProject1.service;

import org.springframework.stereotype.Service;

import com.hcl.TestProject1.repository.PatientRepository;

@Service
public class PatientService {
    private final PatientRepository repository;

    PatientService(PatientRepository repository) {
        this.repository = repository;
    }
}
