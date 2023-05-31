package com.example.jobhub.Repository;

import com.example.jobhub.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompnyRepository extends JpaRepository<Company,Integer> {
    Company findCompanyBycompanyName(String companyName);
}
