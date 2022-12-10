package com.info.biographyservice.controller;

import com.info.biographyservice.domain.Summary;
import com.info.biographyservice.service.SummaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/summary")
@Slf4j
public class summaryController {

    @Autowired
    private SummaryService summaryService;

    @GetMapping(value="/summary-details")
    public ResponseEntity<Summary> getSummary() {
        log.info("Get Summary details Controller");
        Summary summarDetails = summaryService.getSummaryDetails();
        return new ResponseEntity<>(summarDetails, HttpStatus.OK);
    }

    @PostMapping(value="/save-summary")
    public ResponseEntity<Summary> saveSummary(@RequestBody Summary summary) {
        Summary summarDetails = summaryService.saveSummary(summary);
        return new ResponseEntity<>(summarDetails, HttpStatus.CREATED);
    }

}
