package com.example.jobhub.Controller;

import com.example.jobhub.Services.SeekersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/seekers")
@RequiredArgsConstructor
public class SeekersController {
    private  final SeekersServices seekersServices;
}
