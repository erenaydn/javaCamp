package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	boolean existsCandidateByIdentityNumber(String identityNumber);
	 
	List<Candidate> findByCandidateIdOrderBySchools_graduationDate(int candidateId);
	
	List<Candidate> findByCandidateIdOrderByJobExperiences_endDate(int candidateId);
}
