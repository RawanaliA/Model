package com.example.jobhub.Services;

import com.example.jobhub.ApiExeption.ApiExeption;
import com.example.jobhub.Model.Company;
import com.example.jobhub.Model.JobOffer;
import com.example.jobhub.Repository.JopOfferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JopOfferService {
    private final JopOfferRepository jopOfferRepository;
    public List<JobOffer> getAllJopOffer(){

        return jopOfferRepository.findAll();
    }
    public JobOffer addJopOffer(JobOffer jobOffer ){
        JobOffer jobOffer1 =jopOfferRepository.save(jobOffer);
        return  jobOffer1;
    }
    public JobOffer  updateJopOffer(JobOffer jobOffer , Integer id) {
        JobOffer jobOffer1 =jopOfferRepository.getById(id);
        if (jobOffer1 == null) {
            throw new ApiExeption("Enter Correct id");
        }
        jobOffer1.setCompanyName(jobOffer.getCompanyName());
        jobOffer1.setCategory(jobOffer.getCategory());
        jobOffer1.setPositionName(jobOffer.getPositionName());
        jopOfferRepository.save(jobOffer1);
        return jobOffer1;}
    public JobOffer deleteCompany(Integer id){
        JobOffer jobOffer  = jopOfferRepository.getById(id);
        if (jobOffer == null) {
            throw new ApiExeption("Enter Correct id");
        }
        jopOfferRepository.deleteById(id);
        return jobOffer;
    }


}
