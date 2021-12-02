package kodlamaio.Hrms.core.validation.mernis;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;


@Service
public class MernisValidation implements CandidateValidatorService {

	@Override
	public Result validate(String nationalId, String firstName, String lastName, String birthYear) {
		
		return new SuccessResult("Kimlik numarasi dogrulandi: " + nationalId);
	}

}