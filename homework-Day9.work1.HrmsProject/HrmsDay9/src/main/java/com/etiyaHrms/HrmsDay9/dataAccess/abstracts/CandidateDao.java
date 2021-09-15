package com.etiyaHrms.HrmsDay9.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiyaHrms.HrmsDay9.entities.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	boolean existsCandidateByIdentityNumber(String identityNumber);

}
