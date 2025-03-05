package com.example.bsc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "company_code")
@NoArgsConstructor
public class CompanyCode extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "corp_name")
    private String corpName;

    @Column(name = "corp_code")
    private String corpCode;
}
