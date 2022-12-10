package com.info.biographyservice.service.impl;

import com.info.biographyservice.domain.Personal;
import com.info.biographyservice.repository.PersonalRepository;
import com.info.biographyservice.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalServiceImpl implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public Personal getPersonalDetails() {
        // Here hard coded a value, since we know Pranav's details are stored with primary key 1L.
        return personalRepository.findById(1L).get();
    }
}
