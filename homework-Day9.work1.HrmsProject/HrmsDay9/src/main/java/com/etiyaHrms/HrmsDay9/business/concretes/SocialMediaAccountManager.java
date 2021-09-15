package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.SocialMediaAccountService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.SocialMediaAccountDao;
import com.etiyaHrms.HrmsDay9.entities.SocialMediaAccount;

@Service
public class SocialMediaAccountManager implements SocialMediaAccountService {

	private SocialMediaAccountDao socialMediaAccountDao;

	@Autowired
	public SocialMediaAccountManager(SocialMediaAccountDao socialMediaAccountDao) {
		super();
		this.socialMediaAccountDao = socialMediaAccountDao;
	}

	@Override
	public DataResult<List<SocialMediaAccount>> getAll() {
		return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccountDao.findAll());
	}

	@Override
	public Result add(SocialMediaAccount socialMediaAccount) {
		this.socialMediaAccountDao.save(socialMediaAccount);
		return new SuccessResult();
	}

}
