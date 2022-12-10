package com.info.biographyservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name  = "EXPERIENCE")
public class Experience {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "ID")
    private Long id;

    @Column(name = "POSITION")
    private String position;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "COMPANY")
    private String company;

    @Column(name = "CLIENT")
    private String client;

    @Column(name = "YEAR")
    private String year;

    @Column(name = "DESCRIPTION")
    private String description;

}
