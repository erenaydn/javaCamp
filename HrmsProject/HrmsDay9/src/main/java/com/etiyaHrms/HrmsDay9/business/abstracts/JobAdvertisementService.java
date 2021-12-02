package com.etiyaHrms.HrmsDay9.business.abstracts;

import java.util.List;

import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();

	Result add(JobAdvertisement jobAdvertisement);

	DataResult<List<JobAdvertisement>> getByIsActiveTrue();

	DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByReleaseDateDesc();

	DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer(int employerId);

}
