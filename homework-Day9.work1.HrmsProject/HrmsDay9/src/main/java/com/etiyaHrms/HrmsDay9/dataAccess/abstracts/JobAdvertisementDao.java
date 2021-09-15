package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	List<JobAdvertisement> getByIsActiveTrue();

	// List<JobAdvertisement> getByIsActiveFalse();

	List<JobAdvertisement> getByIsActiveTrueOrderByReleaseDateDesc();

	List<JobAdvertisement> getByIsActiveTrueAndEmployer(int employerId);

}
