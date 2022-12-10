package com.info.biographyservice.service;

import com.info.biographyservice.domain.Skills;
import org.springframework.stereotype.Service;

public interface SkillService {
    Skills getskillDetailsByType(String type);
}
