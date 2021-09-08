package kodlamaio.hrms2.core.validation.mernis;

import java.util.Date;

import kodlamaio.hrms2.core.utilities.Result;

public interface JobSeekerValidatorService {
	Result validate(String nationalId, String firstName, String lastName, Date birthYear);
}
