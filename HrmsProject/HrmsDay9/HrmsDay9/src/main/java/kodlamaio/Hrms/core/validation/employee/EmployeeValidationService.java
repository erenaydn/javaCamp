package kodlamaio.Hrms.core.validation.employee;

import kodlamaio.Hrms.core.utilities.results.Result;

public interface EmployeeValidationService {
    Result activateEmployer(String email);
}