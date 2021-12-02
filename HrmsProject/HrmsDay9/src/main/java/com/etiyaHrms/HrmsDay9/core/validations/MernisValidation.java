package com.etiyaHrms.HrmsDay9.core.validations;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;

@Service
public class MernisValidation implements CandidateValidatorService {

	@Override
	public Result validate(String nationalId, String firstName, String lastName, Date birthDate) {

		return new SuccessResult("Kimlik numarasi dogrulandi: " + nationalId);
	}

}