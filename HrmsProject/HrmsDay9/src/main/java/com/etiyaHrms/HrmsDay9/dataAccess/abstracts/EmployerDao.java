package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
