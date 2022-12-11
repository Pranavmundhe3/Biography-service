package com.info.biographyservice.controller;

import com.info.biographyservice.domain.Skills;
import com.info.biographyservice.service.SkillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://resume-client-ui-jar.s3-website-us-east-1.amazonaws.com",allowedHeaders="*")
@RestController
@RequestMapping("/skill")
@Slf4j
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping(value="/skill-details/type/{type}")
    public ResponseEntity<Skills> getskillDetailsByType(@PathVariable String type) {
        log.info("Get skill details by {} ", type );
        Skills skills = skillService.getskillDetailsByType(type);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

}
