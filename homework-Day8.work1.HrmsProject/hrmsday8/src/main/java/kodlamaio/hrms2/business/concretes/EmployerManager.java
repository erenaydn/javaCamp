package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.EmployerService;
import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.ErrorResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.core.utilities.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.SuccessResult;
import kodlamaio.hrms2.core.validation.mail.MailValidationService;
import kodlamaio.hrms2.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms2.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private MailValidationService mailValidationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, MailValidationService mailValidationService) {
		super();
		this.employerDao = employerDao;
		this.mailValidationService = mailValidationService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "İş verenler listelendi.");
	}

	@Override
	public Result add(Employer employer) {
		if (!dataControl(employer))
			return new ErrorResult("Alanlar boş bırakılamaz.");

		if (!mailValidationService.validate(employer.getUser().getEmail()).isSuccess())
			return new ErrorResult("Girilen email hatalı.");

		if (employerDao.existsEmployerByUser_Email(employer.getUser().getEmail()))
			return new ErrorResult("Email sisteme daha önce kaydolmuş");

		if (!mailValidationService.checkEmailDomain(employer.getWebAddress(), employer.getUser().getEmail()))
			return new ErrorResult("Email ile web adresi uyumlu değil.");

		if (!mailValidationService.validate(employer.getUser().getEmail()).isSuccess())
			return new ErrorResult("Mail doğrulaması başarısız.");

		this.employerDao.save(employer);
		return new SuccessResult("İş veren sisteme başarıyla kaydedildi.");
	}
	
	private boolean dataControl(Employer employer) {
		if (employer.getCompanyName() == null || employer.getCompanyName().isBlank() || employer.getWebAddress() == null
				|| employer.getWebAddress().isBlank() || employer.getUser().getEmail() == null || employer.getUser().getEmail().isBlank()
				|| employer.getUser().getPassword() == null || employer.getUser().getPassword().isBlank()
				|| employer.getPhoneNumber() == null || employer.getPhoneNumber().isBlank()) {
			return false;
		} else {
			return true;
		}
	}

}
