package com.info.biographyservice.repository;

import com.info.biographyservice.domain.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {
    
}
