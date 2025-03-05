package com.example.bsc.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CompanyCodeRequest {
    private Long id;
    private String corpName;
    private String corpCode;
    private LocalDateTime createdAt;
}
