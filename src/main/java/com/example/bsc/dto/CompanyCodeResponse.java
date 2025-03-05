package com.example.bsc.dto;

import lombok.Getter;

@Getter
public class CompanyCodeResponse {
    private final String apiKey;

    public CompanyCodeResponse(String apiKey) {
        this.apiKey = apiKey;
    }
}
