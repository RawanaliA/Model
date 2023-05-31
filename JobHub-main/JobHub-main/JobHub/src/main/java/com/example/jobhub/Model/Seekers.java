package com.example.jobhub.Model;

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
public class Seekers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seekersID;

    private  String seekerName;
    private  String email;

//    @OneToOne(cascade = CascadeType.ALL,mappedBy = "seekers")
//    @PrimaryKeyJoinColumn
//    private Resume resume ;



}
