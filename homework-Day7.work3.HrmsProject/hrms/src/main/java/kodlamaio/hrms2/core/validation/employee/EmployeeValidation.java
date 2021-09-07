package kodlamaio.hrms2.core.validation.employee;

import org.springframework.stereotype.Service;

import kodlamaio.hrms2.core.utilities.Result;

@Service
public class EmployeeValidation implements EmployeeValidationService {

	@Override
	public Result activateEmployer(String email) {
		return new Result(true, email + ": Mail sistem personeli tarafından doğrulandı.");
	}

}
