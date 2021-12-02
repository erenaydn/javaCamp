package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.CandidateService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.ErrorResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessResult;
import com.etiyaHrms.HrmsDay9.core.validations.CandidateValidatorService;
import com.etiyaHrms.HrmsDay9.core.validations.MailValidationService;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.CandidateDao;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.UserDao;
import com.etiyaHrms.HrmsDay9.entities.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	private UserDao userDao;
	private CandidateValidatorService candidateValidatorService;
	private MailValidationService mailValidationService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, CandidateValidatorService candidateValidatorService,
			MailValidationService mailValidationService, UserDao userDao) {
		super();
		this.candidateDao = candidateDao;
		this.candidateValidatorService = candidateValidatorService;
		this.mailValidationService = mailValidationService;
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {

		if (!this.dataControl(candidate))
			return new ErrorResult("Kayıt için eksik değer girildi, kontrol edip tekrar deneyin.");

		if (!candidateValidatorService.validate(candidate.getIdentityNumber(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getBirthDate()).isSuccess())
			return new ErrorResult("Kullanici kimligi dogrulanamadi");

		if (userDao.existsUserByEmail(candidate.getEmail()))
			return new ErrorResult("Email sisteme daha önce kaydolmuş");

		if (candidateDao.existsCandidateByIdentityNumber(candidate.getIdentityNumber()))
			return new ErrorResult("Kimlik numaranız sistemde kayıtlıdır.");

		if (!mailValidationService.validate(candidate.getEmail()).isSuccess())
			return new ErrorResult("Mail dogrulamasi basarisiz");

		candidateDao.save(candidate);
		userDao.save(candidate);
		return new SuccessResult(candidate.getEmail() + " : Sisteme kaydoldu");

	}

	private boolean dataControl(Candidate candidate) {
		if (candidate.getEmail() == null || candidate.getEmail().isBlank() || candidate.getFirstName() == null
				|| candidate.getFirstName().isBlank() || candidate.getLastName() == null
				|| candidate.getLastName().isBlank() || candidate.getIdentityNumber() == null
				|| candidate.getIdentityNumber().isBlank() || candidate.getPassword() == null
				|| candidate.getPassword().isBlank() || candidate.getPasswordRepeat() == null
				|| candidate.getPasswordRepeat().isBlank()) {
			return false;
		} else {
			return true;
		}
	}

}
