package com.info.biographyservice.service.impl;

import com.info.biographyservice.domain.Certifications;
import com.info.biographyservice.repository.CertificationRepository;
import com.info.biographyservice.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationServiceImpl implements CertificationService {

    @Autowired
    private CertificationRepository certificationRepository;

    @Override
    public List<Certifications> getCertificationDetails() {
        return certificationRepository.findAll();
    }
}
