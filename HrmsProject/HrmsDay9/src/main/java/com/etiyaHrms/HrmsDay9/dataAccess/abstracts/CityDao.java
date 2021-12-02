package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.City;



public interface CityDao extends JpaRepository<City, Integer> {
	
	
}
