package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.JobAdvertisementService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.JobAdvertisementDao;
import com.etiyaHrms.HrmsDay9.entities.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao advertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao advertisementDao) {
		super();
		this.advertisementDao = advertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.advertisementDao.findAll());
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.advertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.getByIsActiveTrue(),
				"Aktif iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByReleaseDateDesc() {
		return new SuccessDataResult<List<JobAdvertisement>>(
				advertisementDao.getByIsActiveTrueOrderByReleaseDateDesc());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.getByIsActiveTrueAndEmployer(employerId));
	}

}
