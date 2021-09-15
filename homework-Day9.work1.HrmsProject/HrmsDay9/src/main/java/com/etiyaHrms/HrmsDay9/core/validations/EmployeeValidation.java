package com.etiyaHrms.HrmsDay9.core.validations;

import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.core.utilities.Result;

@Service
public class EmployeeValidation implements EmployeeValidationService {

	@Override
	public Result activateEmployer(String email) {
		return new Result(true, email + ": Mail sistem personeli tarafından dogrulandi");
	}
}