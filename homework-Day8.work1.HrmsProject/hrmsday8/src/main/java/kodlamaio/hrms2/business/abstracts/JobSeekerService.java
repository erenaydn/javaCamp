package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();

	Result add(JobSeeker jobSeeker);
}
