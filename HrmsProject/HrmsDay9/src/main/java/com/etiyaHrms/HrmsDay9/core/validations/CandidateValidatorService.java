package com.etiyaHrms.HrmsDay9.core.validations;

import java.util.Date;

import com.etiyaHrms.HrmsDay9.core.utilities.Result;

public interface CandidateValidatorService {
	Result validate(String nationalId, String firstName, String lastName, Date birthDate);
}
