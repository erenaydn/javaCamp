package com.etiyaHrms.HrmsDay9.business.abstracts;

import java.util.List;

import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.JobExperience;

public interface JobExperienceService {
	DataResult<List<JobExperience>> getAll();

	Result add(JobExperience jobExperience);
}
