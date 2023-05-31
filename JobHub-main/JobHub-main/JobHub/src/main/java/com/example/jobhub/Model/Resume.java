package com.example.jobhub.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Resume {
    @Id
    private Integer resumeID;
    private String resumName;
    private String email;
    private String education;
    private String experince;
    private String skill;

//    @OneToOne
//    @MapsId
//    @JsonIgnore
//    private Seekers seekers;
}
