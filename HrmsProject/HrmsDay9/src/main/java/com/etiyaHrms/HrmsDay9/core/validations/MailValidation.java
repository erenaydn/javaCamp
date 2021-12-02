package com.etiyaHrms.HrmsDay9.core.validations;

import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.core.utilities.Result;

@Service
public class MailValidation implements MailValidationService {

	@Override
	public Result validate(String email) {
		return new Result(true, email + ": Mail dogrulandi");
	}

	@Override
	public boolean checkEmailDomain(String webAddress, String email) {
		return webAddress.contains(email.split("@")[1]);
	}

}
