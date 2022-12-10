package com.info.biographyservice.repository;

import com.info.biographyservice.domain.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skills, Long> {

    Skills findByType(String type);
    
}
