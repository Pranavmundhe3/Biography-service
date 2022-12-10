package com.info.biographyservice.service.impl;

import com.info.biographyservice.domain.Skills;
import com.info.biographyservice.repository.SkillRepository;
import com.info.biographyservice.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Skills getskillDetailsByType(String type) {
        return skillRepository.findByType(type);
    }
}
