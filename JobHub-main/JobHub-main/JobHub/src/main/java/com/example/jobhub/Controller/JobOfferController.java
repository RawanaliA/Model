package com.example.jobhub.Controller;

import com.example.jobhub.ApiResponce.ApiRecponse;
import com.example.jobhub.Model.Company;
import com.example.jobhub.Model.JobOffer;
import com.example.jobhub.Services.CompanyService;
import com.example.jobhub.Services.JopOfferService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobOffer")
@RequiredArgsConstructor
public class JobOfferController {
    private final JopOfferService jopOfferService;
    @GetMapping("/get")
    public ResponseEntity getAlljopOfferService(){
        List<JobOffer> jobOfferList=jopOfferService.getAllJopOffer();
        return ResponseEntity.status(200).body(jobOfferList);
    }
    @PostMapping("/add")
    public ResponseEntity addjopOffer(@Valid @RequestBody JobOffer jobOffer ){
        jopOfferService.addJopOffer(jobOffer);
        return ResponseEntity.status(200).body(new ApiRecponse("JopOffer added Succuffully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updatejopOffer(@Valid @RequestBody JobOffer jobOffer , @PathVariable Integer id){
        jopOfferService.updateJopOffer(jobOffer,id);
        return ResponseEntity.status(200).body("Company Updated Succuffully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletejopOffer(@PathVariable Integer id){
        jopOfferService.deleteCompany(id);
        return ResponseEntity.status(200).body("Company deleted Succuffully");
    }

}
