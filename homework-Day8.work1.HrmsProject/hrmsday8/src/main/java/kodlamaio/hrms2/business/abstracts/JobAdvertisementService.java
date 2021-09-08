package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.entities.concretes.JobAdvertisement;


public interface JobAdvertisementService {
	 	Result add(JobAdvertisement jobAdvertisement);
	 	
	 	DataResult<List<JobAdvertisement>> getByActiveStatus();
	 	
	 	DataResult<List<JobAdvertisement>> getByActiveAndEmployerName(String employerName);

	 	DataResult<List<JobAdvertisement>> getByAscDate();

}
