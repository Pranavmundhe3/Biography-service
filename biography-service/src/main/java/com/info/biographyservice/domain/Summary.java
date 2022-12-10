package com.info.biographyservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name  = "SUMMARY")
public class Summary {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column(name = "ID")
    private Long id;

    @Column(name = "SUMMARY_DETAILS")
    private String summaryInfo;

}
