package com.info.biographyservice.repository;

import com.info.biographyservice.domain.Certifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certifications, Long> {
    
}
