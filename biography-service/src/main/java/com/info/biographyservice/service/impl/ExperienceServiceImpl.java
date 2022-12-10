package com.info.biographyservice.service.impl;

import com.info.biographyservice.domain.Experience;
import com.info.biographyservice.repository.ExperienceRepository;
import com.info.biographyservice.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public Experience getExperienceDetails() {
        // Here hard coded a value, since we know Pranav's details are stored with primary key 1L.
        return experienceRepository.findById(1L).get();
    }
}
