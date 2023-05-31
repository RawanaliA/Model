package com.example.jobhub.Repository;

import com.example.jobhub.Model.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JopOfferRepository extends JpaRepository<JobOffer,Integer> {
}
