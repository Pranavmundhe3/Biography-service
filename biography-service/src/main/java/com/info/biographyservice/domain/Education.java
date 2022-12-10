package com.info.biographyservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name  = "EDUCATION")
public class Education {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "ID")
    private Long id;

    @Column(name = "DEGREE")
    private String degree;

    @Column(name = "UNIVERSITY")
    private String university;

    @Column(name = "YEAR_OF_COMPLETION")
    private String yearOfCompletion;

    @Column(name = "GRADES")
    private String grades;

}
