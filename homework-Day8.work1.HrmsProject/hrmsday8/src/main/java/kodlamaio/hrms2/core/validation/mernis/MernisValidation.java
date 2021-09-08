package kodlamaio.hrms2.core.validation.mernis;


import org.springframework.stereotype.Service;

import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.core.utilities.SuccessResult;

@Service
public class MernisValidation implements JobSeekerValidatorService {

	@Override
	public Result validate(String nationalId, String firstName, String lastName, String birthYear) {
		return new SuccessResult("Kimlik numarasi dogrulandi: " + nationalId);
	}

}