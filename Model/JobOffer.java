package com.example.jobhub.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class JobOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobOfferID;
    @NotEmpty
    @Column(columnDefinition = "varchare(20) not Null")
    private String positionName;

    private Integer offerID;
    @NotEmpty
    @Column(columnDefinition = "varchare(20) not Null")
    private String companyName;
    @NotEmpty
    @Column(columnDefinition = "varchare(20) not Null")
    private String category;
}
