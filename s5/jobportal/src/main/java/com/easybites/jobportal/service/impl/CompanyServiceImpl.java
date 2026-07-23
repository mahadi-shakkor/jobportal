package com.easybites.jobportal.service.impl;

import com.easybites.jobportal.dto.CompanyDto;
import com.easybites.jobportal.entity.Company;
import com.easybites.jobportal.repository.CompanyRepository;
import com.easybites.jobportal.service.ICompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;



    @Override
    public List<CompanyDto> getAllCompanies() {
        List<Company> companyList =companyRepository.findAll();
        return companyList.stream().map(this::transformToDto).collect(Collectors.toList());
    }


    private CompanyDto transformToDto(Company company) {
        return new CompanyDto(company.getId(), company.getName(), company.getLogo(),
                company.getIndustry(), company.getSize(), company.getRating(),
                company.getLocations(), company.getFounded(), company.getDescription(),
                company.getEmployees(), company.getWebsite(), company.getCreatedAt());
    }
}
