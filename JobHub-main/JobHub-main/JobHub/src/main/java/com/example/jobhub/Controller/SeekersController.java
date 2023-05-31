package com.example.jobhub.Controller;

import com.example.jobhub.ApiResponce.ApiRecponse;
import com.example.jobhub.Model.Resume;
import com.example.jobhub.Model.Seekers;
import com.example.jobhub.Services.SeekersServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/seekers")
@RequiredArgsConstructor
public class SeekersController {
    private  final SeekersServices seekersServices;
    @GetMapping("/get")
    public ResponseEntity getAlljopOfferService(){
        List<Seekers>seekers =seekersServices.getAllResume();
        return ResponseEntity.status(200).body(seekers);
    }
    @PostMapping("/add")
    public ResponseEntity addResume(@Valid @RequestBody Seekers seekers ){
        seekersServices.addSeekers(seekers);
        return ResponseEntity.status(200).body(new ApiRecponse("Seekers added Succuffully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateResume(@Valid @RequestBody Seekers seekers, @PathVariable Integer id){
        seekersServices.updateSeeker(seekers,id);
        return ResponseEntity.status(200).body("Seekers Updated Succuffully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteResume(@PathVariable Integer id){
        seekersServices.deleteSeeker(id);
        return ResponseEntity.status(200).body("Seekers deleted Succuffully");
    }
}
