package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.core.utilities.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.SuccessResult;
import kodlamaio.hrms2.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms2.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementdao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementdao) {
		super();
		this.jobAdvertisementdao = jobAdvertisementdao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementdao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveStatus() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementdao.getByActiveStatus());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveAndEmployerName(String employerName) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementdao.getByCompanyNameAndActive(employerName));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByAscDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementdao.getByAscDate());
	}

}
