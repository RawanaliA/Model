package com.example.jobhub.Services;

import com.example.jobhub.ApiExeption.ApiExeption;
import com.example.jobhub.Model.Resume;
import com.example.jobhub.Model.Seekers;
import com.example.jobhub.Repository.ResmeRepository;
import com.example.jobhub.Repository.SeekersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeekersServices {
    private final SeekersRepository seekersRepository ;
    public List<Seekers> getAllResume(){

        return seekersRepository.findAll();
    }
    public Seekers addResume(Seekers seekers  ){
        Seekers seekers1 =seekersRepository.save(seekers);
        return  seekers1;
    }
    public Seekers  updateResume(Seekers seekers , Integer id) {
        Seekers seekers1  =seekersRepository.getById(id);
        if (seekers1 == null) {
            throw new ApiExeption("Enter Correct id");
        }
        seekers1.setSeekerName(seekers.getSeekerName());
        seekers1.setEmail(seekers.getEmail());
      seekers1.setResume(seekers.getResume());
        seekersRepository.save(seekers1);
        return seekers1;}
//    public Seekers deleteResume(Integer id){
//        Seekers seekers   = seekersRepository.getById(id);
//        if (seekers == null) {
//            throw new ApiExeption("Enter Correct id");
//        }
//        seekersRepository.deleteById(id);
//        return seekers;
//    }

}
