package com.easybites.jobportal.service;

import com.easybites.jobportal.dto.CompanyDto;
import com.easybites.jobportal.entity.Company;

import java.util.List;

public interface ICompanyService {
    List<CompanyDto> getAllCompanies();
}
