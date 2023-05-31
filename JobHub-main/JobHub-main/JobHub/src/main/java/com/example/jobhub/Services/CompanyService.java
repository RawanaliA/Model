package com.example.jobhub.Services;

import com.example.jobhub.ApiExeption.ApiExeption;
import com.example.jobhub.Model.Company;
import com.example.jobhub.Repository.CompnyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompnyRepository compnyRepository;
    //CRUD
    public List<Company> getAllCompany(){

        return compnyRepository.findAll();
    }
    public Company addCompany(Company company){
        Company company1 =compnyRepository.save(company);
        return  company1;
    }
    public Company  updateCompany(Company company, Integer id) {
        Company company2=compnyRepository.getById(id);
        if (company2 == null) {
            throw new ApiExeption("Enter Correct id");
        }
        company2.setCompanyName(company.getCompanyName());
        company2.setDescription(company.getDescription());
        company2.setEmail(company.getEmail());
        compnyRepository.save(company2);
        return company2;}
    public Company deleteCompany(Integer id){
        Company company3  = compnyRepository.getById(id);
        if (company3 == null) {
            throw new ApiExeption("Enter correct id");
        }
        compnyRepository.deleteById(id);
        return company3;
    }


}
