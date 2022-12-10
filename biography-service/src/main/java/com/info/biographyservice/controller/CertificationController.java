package com.info.biographyservice.controller;

import com.info.biographyservice.domain.Certifications;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.info.biographyservice.service.impl.CertificationServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/certification")
@Slf4j
public class CertificationController {

    @Autowired
    private CertificationServiceImpl certificationService;

    @GetMapping(value="/certification-details")
    public ResponseEntity<List<Certifications>> getCertification() {
        log.info("Get Certification details Controller");
        List<Certifications> certifications = certificationService.getCertificationDetails();
        return new ResponseEntity<>(certifications, HttpStatus.FOUND);
    }

}
