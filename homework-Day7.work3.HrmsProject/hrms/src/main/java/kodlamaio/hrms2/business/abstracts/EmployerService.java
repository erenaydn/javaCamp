package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();

	Result add(Employer employer);

}
