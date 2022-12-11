package com.info.biographyservice.controller;

import com.info.biographyservice.domain.Personal;
import com.info.biographyservice.service.PersonalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://resume-client-ui-jar.s3-website-us-east-1.amazonaws.com",allowedHeaders="*")
@RestController
@RequestMapping("/personal")
@Slf4j
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @GetMapping(value="/personal-details")
    public ResponseEntity<Personal> getPersonal() {
        log.info("Get Personal details Controller");
        Personal personalDetails = personalService.getPersonalDetails();
        return new ResponseEntity<>(personalDetails, HttpStatus.OK);
    }

}
