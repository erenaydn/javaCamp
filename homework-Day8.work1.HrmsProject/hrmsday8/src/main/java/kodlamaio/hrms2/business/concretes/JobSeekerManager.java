package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.JobSeekerService;
import kodlamaio.hrms2.core.dataAccess.UserDao;
import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.ErrorResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.core.utilities.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.SuccessResult;
import kodlamaio.hrms2.core.validation.mail.MailValidationService;
import kodlamaio.hrms2.core.validation.mernis.JobSeekerValidatorService;
import kodlamaio.hrms2.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms2.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private UserDao userDao;
	private JobSeekerValidatorService jobSeekerValidatorService;
	private MailValidationService mailValidationService;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, UserDao userDao,
			JobSeekerValidatorService jobSeekerValidatorService, MailValidationService mailValidationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.userDao = userDao;
		this.jobSeekerValidatorService = jobSeekerValidatorService;
		this.mailValidationService = mailValidationService;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "İş arayanlar listelendi.");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		if (!this.dataControl(jobSeeker))
			return new ErrorResult("Kayıt için eksik değer girildi, kontrol edip tekrar deneyin.");

		if (!jobSeekerValidatorService.validate(jobSeeker.getIdentityNumber(), jobSeeker.getFirstName(),
				jobSeeker.getLastName(), jobSeeker.getBirthDate()).isSuccess())
			return new ErrorResult("Kullanıcı kimliği doğrulanamadı.");

		if (userDao.existsUserByEmail(jobSeeker.getUser().getEmail()))
			return new ErrorResult("Email bu sisteme kayıtlı.");

		if (jobSeekerDao.existsJobSeekerByIdentityNumber(jobSeeker.getIdentityNumber()))
			return new ErrorResult("Kimlik numaranız sistemde kayıtlıdır.");

		if (!mailValidationService.validate(jobSeeker.getUser().getEmail()).isSuccess())
			return new ErrorResult("Mail doğrulaması başarısız.");

		jobSeekerDao.save(jobSeeker);
		return new SuccessResult(jobSeeker.getUser().getEmail() + " : Sisteme kaydoldu.");
	}

	private boolean dataControl(JobSeeker jobSeeker) {
		if (jobSeeker.getUser().getEmail() == null || jobSeeker.getUser().getEmail().isBlank() || jobSeeker.getFirstName() == null
				|| jobSeeker.getFirstName().isBlank() || jobSeeker.getLastName() == null
				|| jobSeeker.getLastName().isBlank() || jobSeeker.getIdentityNumber() == null
				|| jobSeeker.getIdentityNumber().isBlank() || jobSeeker.getUser().getPassword() == null
				|| jobSeeker.getUser().getPassword().isBlank()) {
			return false;
		} else {
			return true;
		}
	}

}
