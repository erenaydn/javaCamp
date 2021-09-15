package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;


public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>>  getByActivatedTrue();
	
	DataResult<List<JobAdvertisement>>  getByActivatedTrueOrderByReleaseDateDesc();
	
	DataResult<List<JobAdvertisement>> getByActivatedTrueAndEmployer_CompanyNameDataResult(String companyName);
	
}
