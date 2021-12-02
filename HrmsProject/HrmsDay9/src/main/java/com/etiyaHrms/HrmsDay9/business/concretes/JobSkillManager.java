package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.JobSkillService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.JobSkillDao;
import com.etiyaHrms.HrmsDay9.entities.JobSkill;

@Service
public class JobSkillManager implements JobSkillService {

	private JobSkillDao jobSkillDao;

	@Autowired
	public JobSkillManager(JobSkillDao jobSkillDao) {
		super();
		this.jobSkillDao = jobSkillDao;
	}

	@Override
	public DataResult<List<JobSkill>> getAll() {
		return new SuccessDataResult<List<JobSkill>>(this.jobSkillDao.findAll());
	}

	@Override
	public Result add(JobSkill jobSkill) {
		this.jobSkillDao.save(jobSkill);
		return new SuccessResult();
	}

}
