package kodlamaio.hrms2.core.validation.mernis;

import kodlamaio.hrms2.core.utilities.Result;

public interface JobSeekerValidatorService {
	Result validate(String nationalId, String firstName, String lastName, String birthYear);
}
