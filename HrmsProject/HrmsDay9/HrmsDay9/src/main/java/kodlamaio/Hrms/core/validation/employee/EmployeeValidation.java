package kodlamaio.Hrms.core.validation.employee;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.results.Result;

@Service
public class EmployeeValidation implements EmployeeValidationService{

    @Override
    public Result activateEmployer(String email) {
    	return new Result(true, email + ": Mail sistem personeli tarafından dogrulandi");
    }
}