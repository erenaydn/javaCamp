package com.etiyaHrms.HrmsDay9.core.validations;

import com.etiyaHrms.HrmsDay9.core.utilities.Result;

public interface MailValidationService {
	Result validate(String email);

	boolean checkEmailDomain(String webAddress, String email);
}
