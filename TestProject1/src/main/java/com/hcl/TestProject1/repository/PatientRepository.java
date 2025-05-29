package com.hcl.TestProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.TestProject1.modal.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {}
