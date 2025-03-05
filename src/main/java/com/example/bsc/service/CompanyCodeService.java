package com.example.bsc.service;

import com.example.bsc.repository.CompanyCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyCodeService {
    private final CompanyCodeRepository companyCodeRepository;
}
