package com.info.biographyservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name  = "PERSONAL")
public class Personal {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DOB")
    private String dob;

    @Column(name = "HOBBIES")
    private String hobbies;

    @Column(name = "LANGUAGES")
    private String languages;

}
