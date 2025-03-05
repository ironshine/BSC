package com.example.bsc.controller;

import com.example.bsc.service.CompanyCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/company-code")
@RequiredArgsConstructor
public class CompanyCodeController {
    private final CompanyCodeService companyCodeService;

}
