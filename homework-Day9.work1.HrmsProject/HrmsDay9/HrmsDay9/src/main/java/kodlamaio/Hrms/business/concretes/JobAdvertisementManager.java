package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService{

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
	public DataResult<List<JobAdvertisement>> getByActivatedTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.getByActivatedTrue(),"Aktif iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActivatedTrueOrderByReleaseDateDesc() {
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.getByActivatedTrueOrderByReleaseDateDesc());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActivatedTrueAndEmployer_CompanyNameDataResult(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>(advertisementDao.getByActivatedTrueAndEmployer_CompanyName(companyName));
	}

}

