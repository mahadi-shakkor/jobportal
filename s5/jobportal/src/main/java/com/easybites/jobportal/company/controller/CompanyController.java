package com.easybites.jobportal.company.controller;

import com.easybites.jobportal.dto.CompanyDto;
import com.easybites.jobportal.entity.Company;
import com.easybites.jobportal.service.ICompanyService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
//@CrossOrigin(origins = {"http://localhost:5173/"})
public class CompanyController {

    private final ICompanyService companyService;



    @GetMapping(version="1.0")
    public ResponseEntity<List<CompanyDto>> getAllCompanies() {
        List<CompanyDto> companies = companyService.getAllCompanies();
        return ResponseEntity.ok().body(companies);

    }




}
