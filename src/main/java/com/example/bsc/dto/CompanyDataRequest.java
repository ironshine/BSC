package com.example.bsc.dto;

import lombok.Getter;

@Getter
public class CompanyDataRequest {
    private Long id;
    private String corpName;
    private Short issueCount;
    private Long totalSales;
    private Float productionCapacity;
    private Float operationRate;
    private Short cost;
}
