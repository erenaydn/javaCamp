package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms2.business.abstracts.JobPositionService;
import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.core.utilities.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.SuccessResult;
import kodlamaio.hrms2.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonları listelendi.");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu eklendi.");
	}

}
