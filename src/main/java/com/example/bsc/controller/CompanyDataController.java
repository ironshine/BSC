package com.example.bsc.controller;


import com.example.bsc.service.CompanyDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/company-data")
@RequiredArgsConstructor
public class CompanyDataController {
    private CompanyDataService companyDataService;

}
