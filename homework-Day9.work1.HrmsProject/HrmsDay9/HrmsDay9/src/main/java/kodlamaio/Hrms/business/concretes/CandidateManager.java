package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateService;
import kodlamaio.Hrms.core.dataAccess.UserDao;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.core.validation.mail.MailValidationService;
import kodlamaio.Hrms.core.validation.mernis.CandidateValidatorService;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.entities.concretes.Candidate;

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
				candidate.getLastName(), candidate.getBirthYear()).isSuccess())
			return new ErrorResult("Kullanici kimligi dogrulanamadi");

		if (userDao.existsUserByEmail(candidate.getUser().getEmail()))
			return new ErrorResult("Email sisteme daha önce kaydolmuş");

		if (candidateDao.existsCandidateByIdentityNumber(candidate.getIdentityNumber()))
			return new ErrorResult("Kimlik numaranız sistemde kayıtlıdır.");

		if (!mailValidationService.validate(candidate.getUser().getEmail()).isSuccess())
			return new ErrorResult("Mail dogrulamasi basarisiz");

		candidateDao.save(candidate);
		return new SuccessResult(candidate.getUser().getEmail() + " : Sisteme kaydoldu");

	}

	private boolean dataControl(Candidate candidate) {
		if (candidate.getUser().getEmail() == null || candidate.getUser().getEmail().isBlank() || candidate.getFirstName() == null
				|| candidate.getFirstName().isBlank() || candidate.getLastName() == null
				|| candidate.getLastName().isBlank() || candidate.getIdentityNumber() == null
				|| candidate.getIdentityNumber().isBlank() || candidate.getUser().getPassword() == null
				|| candidate.getUser().getPassword().isBlank() || candidate.getUser().getPasswordRepeat() == null
				|| candidate.getUser().getPasswordRepeat().isBlank()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public DataResult<List<Candidate>> findByCandidateIdOrderBySchoolsGraduationDate(int candidateId) {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findByCandidateIdOrderBySchools_graduationDate(candidateId));
	}

	@Override
	public DataResult<List<Candidate>> findByCandidateIdOrderByJobExperiencesEndDate(int candidateId) {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findByCandidateIdOrderByJobExperiences_endDate(candidateId));
	}

}
