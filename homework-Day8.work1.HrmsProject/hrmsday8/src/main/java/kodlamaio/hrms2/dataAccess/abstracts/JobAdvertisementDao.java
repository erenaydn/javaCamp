package kodlamaio.hrms2.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms2.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	@Query("From JobAdvertisement where job_status=true")
	List<JobAdvertisement> getByActiveStatus();

	@Query("From JobAdvertisement where job_status=true ORDER BY realese_date ASC")
	List<JobAdvertisement> getByAscDate();

	@Query("From JobAdvertisement where employer.companyName=:companyName and job_status = true")
	List<JobAdvertisement> getByCompanyNameAndActive(String companyName);

}
