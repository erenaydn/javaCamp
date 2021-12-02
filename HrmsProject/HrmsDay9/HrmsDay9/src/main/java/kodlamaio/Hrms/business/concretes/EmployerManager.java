package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.dataAccess.UserDao;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.core.validation.mail.MailValidationService;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private UserDao userDao;
	private MailValidationService mailValidationService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, UserDao userDao, MailValidationService mailValidationService) {
		this.employerDao = employerDao;
		this.userDao = userDao;
		this.mailValidationService = mailValidationService;
	}

	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public Result add(Employer employer) {
		if (!dataControl(employer))
			return new ErrorResult("Alanlar bos birakilamaz");

		if (!mailValidationService.validate(employer.getEmail()).isSuccess())
			return new ErrorResult("Girilen email hatali");

		if (userDao.existsUserByEmail(employer.getEmail()))
			return new ErrorResult("Email sisteme daha önce kaydolmuş");

		if (!mailValidationService.checkEmailDomain(employer.getWebAddress(), employer.getEmail()))
			return new ErrorResult("Email ile web adresi uyumlu degil");

		if (!mailValidationService.validate(employer.getEmail()).isSuccess())
			return new ErrorResult("Mail dogrulamasi basarisiz");

		this.employerDao.save(employer);
		return new SuccessResult("iş veren sisteme başarıyla kaydedildi.");
	}

	private boolean dataControl(Employer employer) {
		if (employer.getCompanyName() == null || employer.getCompanyName().isBlank() || employer.getWebAddress() == null
				|| employer.getWebAddress().isBlank() || employer.getEmail() == null || employer.getEmail().isBlank()
				|| employer.getUser().getPassword() == null || employer.getUser().getPassword().isBlank()
				|| employer.getUser().getPasswordRepeat() == null || employer.getUser().getPasswordRepeat().isBlank()
				|| employer.getPhoneNumber() == null || employer.getPhoneNumber().isBlank()) {
			return false;
		}else {
			return true;
		}
	}
}


