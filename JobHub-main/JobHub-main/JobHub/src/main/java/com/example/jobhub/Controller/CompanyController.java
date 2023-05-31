package com.example.jobhub.Controller;

import com.example.jobhub.ApiResponce.ApiRecponse;
import com.example.jobhub.Model.Company;
import com.example.jobhub.Services.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;
    @GetMapping("/get")
    public ResponseEntity getAllCustomers(){
        List<Company> companyList=companyService.getAllCompany();
        return ResponseEntity.status(200).body(companyList);
    }
    @PostMapping("/add")
    public ResponseEntity addCustomer(@Valid @RequestBody Company company ){
        companyService.addCompany(company);
        return ResponseEntity.status(200).body(new ApiRecponse("Company added"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateCustomer(@Valid @RequestBody Company company, @PathVariable Integer id){
        companyService.updateCompany(company,id);
        return ResponseEntity.status(200).body("Company Updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCustomer(@PathVariable Integer id){
        companyService.deleteCompany(id);
        return ResponseEntity.status(200).body("Company deleted");
    }
}
