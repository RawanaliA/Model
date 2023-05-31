package com.example.jobhub.Services;

import com.example.jobhub.ApiExeption.ApiExeption;
import com.example.jobhub.Model.JobOffer;
import com.example.jobhub.Model.Resume;
import com.example.jobhub.Repository.ResmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumeSrvices {
    private final ResmeRepository resmeRepository;
    public List<Resume> getAllResume(){

        return resmeRepository.findAll();
    }
    public Resume addResume(Resume resume ){
        Resume resume1  =resmeRepository.save(resume);
        return  resume1;
    }
    public Resume  updateResume(Resume resume , Integer id) {
        Resume resume1 =resmeRepository.getById(id);
        if (resume1 == null) {
            throw new ApiExeption("Enter Correct id");
        }
        resume1.setResumName(resume.getResumName());
        resume1.setEmail(resume.getEmail());
        resume1.setEducation(resume.getEducation());
        resume1.setExperince(resume.getExperince());
        resmeRepository.save(resume1);
        return resume1;}
    public Resume deleteResume(Integer id){
        Resume resume  = resmeRepository.getById(id);
        if (resume == null) {
            throw new ApiExeption("Enter Correct id");
        }
        resmeRepository.deleteById(id);
        return resume;
    }
//    public void addReseme( dto){
//        Custmer custmer=custmerRepository.findCustmerById(dto.getCustmer_id());
//        if (custmer == null) {
//            throw new ApiExeption("Can not add Details ,custmer not found");
//        }
//        CustmerDetails custmerDetails =new CustmerDetails(null, dto.getGender(), dto.getAge(), dto.getEmail(), custmer);
//        custmerDetailsRepoistory.save(custmerDetails);
//    }

}
