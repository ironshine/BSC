package com.example.bsc.service;

import com.example.bsc.repository.CompanyDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyDataService {
    private final CompanyDataRepository companyDataRepository;
}
