package com.example.bsc.dto;

import lombok.Getter;

@Getter
public class CompanyDataResponse {
    private final String apiKey;
    private final String corpCode;

    public CompanyDataResponse(String apiKey, String corpCode) {
        this.apiKey = apiKey;
        this.corpCode = corpCode;
    }
}
