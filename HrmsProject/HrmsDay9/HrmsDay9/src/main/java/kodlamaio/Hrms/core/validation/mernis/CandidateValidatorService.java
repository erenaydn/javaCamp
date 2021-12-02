package kodlamaio.Hrms.core.validation.mernis;

import kodlamaio.Hrms.core.utilities.results.Result;

public interface CandidateValidatorService {
	Result validate(String nationalId, String firstName, String lastName, String birthYear);
}
