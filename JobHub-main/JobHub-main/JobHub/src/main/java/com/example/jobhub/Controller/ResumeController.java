package com.example.jobhub.Controller;

import com.example.jobhub.ApiResponce.ApiRecponse;
import com.example.jobhub.Model.JobOffer;
import com.example.jobhub.Model.Resume;
import com.example.jobhub.Services.ResumeSrvices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Resume")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeSrvices resumeSrvices;
    @GetMapping("/get")
    public ResponseEntity getAlljopOfferService(){
        List<Resume> resume=resumeSrvices.getAllResume();
        return ResponseEntity.status(200).body(resume);
    }
    @PostMapping("/add")
    public ResponseEntity addResume(@Valid @RequestBody Resume resume ){
        resumeSrvices.addResume(resume);
        return ResponseEntity.status(200).body(new ApiRecponse("Resume added Succuffully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateResume(@Valid @RequestBody Resume resume, @PathVariable Integer id){
        resumeSrvices.updateResume(resume,id);
        return ResponseEntity.status(200).body("Resume Updated Succuffully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteResume(@PathVariable Integer id){
        resumeSrvices.deleteResume(id);
        return ResponseEntity.status(200).body("Resume deleted Succuffully");
    }

}
