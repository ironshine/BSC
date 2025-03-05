package com.example.bsc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "company_data")
@NoArgsConstructor
public class CompanyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "corp_name")
    private String corpName;

    @Column(name = "issue_count")
    private Short issueCount;

    @Column(name = "total_sales")
    private Long totalSales;

    @Column(name = "production_capacity")
    private Float productionCapacity;

    @Column(name = "operation_rate")
    private Float operationRate;

    @Column(name = "cost")
    private Short cost;
}
