package com.info.biographyservice.controller;

import com.info.biographyservice.domain.Education;
import com.info.biographyservice.service.EducationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/education")
@Slf4j
public class EducationController {

    @Autowired
    private EducationService educationService;

    @GetMapping(value="/education-details")
    public ResponseEntity<Education> getEducation() {
        log.info("Get Education details Controller");
        Education educationDetails = educationService.getEducationDetails();
        return new ResponseEntity<>(educationDetails, HttpStatus.OK);
    }

}
