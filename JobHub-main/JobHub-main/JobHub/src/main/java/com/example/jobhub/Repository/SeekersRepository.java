package com.example.jobhub.Repository;

import com.example.jobhub.Model.Seekers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeekersRepository extends JpaRepository<Seekers,Integer> {
}
