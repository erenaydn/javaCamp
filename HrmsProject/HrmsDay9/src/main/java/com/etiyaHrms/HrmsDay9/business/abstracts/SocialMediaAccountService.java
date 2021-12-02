package com.etiyaHrms.HrmsDay9.business.abstracts;

import java.util.List;

import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.SocialMediaAccount;

public interface SocialMediaAccountService {
	DataResult<List<SocialMediaAccount>> getAll();

	Result add(SocialMediaAccount socialMediaAccount);
}
