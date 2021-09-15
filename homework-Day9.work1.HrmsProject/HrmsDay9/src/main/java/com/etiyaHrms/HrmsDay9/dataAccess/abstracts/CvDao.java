package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.Cv;



public interface CvDao extends JpaRepository<Cv, Integer>{
	Cv getById(int cvId);

}
