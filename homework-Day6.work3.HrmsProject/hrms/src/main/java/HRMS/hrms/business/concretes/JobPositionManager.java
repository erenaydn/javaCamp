package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.JobPositionService;
import HRMS.hrms.dataAccess.abstracts.JobPositionDao;
import HRMS.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {

		return this.jobPositionDao.findAll();
	}

	@Override
	public void add(JobPosition entity) {

		this.jobPositionDao.save(entity);

	}

	@Query
	@Override
	public void update(JobPosition entity) {
		this.jobPositionDao.save(entity);

	}

	@Override
	public void delete(JobPosition entity) {
		this.jobPositionDao.delete(entity);
	}

}
