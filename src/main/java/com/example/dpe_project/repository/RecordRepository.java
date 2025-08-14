package com.example.dpe_project.repository;

import com.example.dpe_project.model.WorkRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<WorkRecord , Integer> {
}
