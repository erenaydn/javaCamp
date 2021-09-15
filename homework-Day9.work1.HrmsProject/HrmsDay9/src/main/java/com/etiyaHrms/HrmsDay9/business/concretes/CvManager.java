package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.CvService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.CvDao;
import com.etiyaHrms.HrmsDay9.entities.Cv;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;

	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll());
	}

	@Override
	public Result add(Cv cv) {
		this.cvDao.save(cv);
		return new SuccessResult();
	}

	@Override
	public DataResult<Cv> getById(int cvId) {
		return new SuccessDataResult<Cv>(this.cvDao.getById(cvId));
	}

}
