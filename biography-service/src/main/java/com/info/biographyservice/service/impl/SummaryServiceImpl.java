package com.info.biographyservice.service.impl;

import com.info.biographyservice.domain.Summary;
import com.info.biographyservice.repository.SummaryRepository;
import com.info.biographyservice.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummaryServiceImpl implements SummaryService {

    @Autowired
    private SummaryRepository summaryRepository;

    @Override
    public Summary getSummaryDetails() {
        // Here hard coded a value, since we know Pranav's details are stored with primary key 1L.
        return summaryRepository.findById(1L).get();
    }

    @Override
    public Summary saveSummary(Summary summary) {
        return summaryRepository.save(summary);
    }
}
