package com.example.jobhub.Repository;

import com.example.jobhub.Model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResmeRepository extends JpaRepository<Resume,Integer> {
}
