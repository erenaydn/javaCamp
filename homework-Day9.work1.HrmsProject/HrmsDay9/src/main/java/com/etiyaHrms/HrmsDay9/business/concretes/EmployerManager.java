package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.EmployerService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.ErrorResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;
import com.etiyaHrms.HrmsDay9.core.validations.MailValidationService;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.EmployerDao;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.UserDao;
import com.etiyaHrms.HrmsDay9.entities.Employer;

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
				|| employer.getPassword() == null || employer.getPassword().isBlank()
				|| employer.getPasswordRepeat() == null || employer.getPasswordRepeat().isBlank()
				|| employer.getPhoneNumber() == null || employer.getPhoneNumber().isBlank()) {
			return false;
		} else {
			return true;
		}
	}
}
