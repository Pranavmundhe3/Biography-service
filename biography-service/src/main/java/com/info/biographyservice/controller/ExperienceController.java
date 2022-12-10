package com.info.biographyservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.info.biographyservice.domain.Experience;
import com.info.biographyservice.service.ExperienceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/experience")
@Slf4j
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @GetMapping(value="/experience-details")
    public ResponseEntity<Experience> getExperience() {
        log.info("Get Experience details Controller");
        Experience experience = experienceService.getExperienceDetails();
        return new ResponseEntity<>(experience, HttpStatus.FOUND);
    }


}
