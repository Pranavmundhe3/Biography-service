package com.info.biographyservice.service.impl;

import com.info.biographyservice.domain.Education;
import com.info.biographyservice.repository.EducationRepository;
import com.info.biographyservice.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationRepository educationRepository;

    @Override
    public Education getEducationDetails() {
        // Here hard coded a value, since we know Pranav's details are stored with primary key 1L.
        return educationRepository.findById(1L).get();
    }
}
