package com.example.dpe_project.repository;

import com.example.dpe_project.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance , Integer> {
}
