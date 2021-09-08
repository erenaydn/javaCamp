package kodlamaio.hrms2.core.validation.mail;

import org.springframework.stereotype.Service;

import kodlamaio.hrms2.core.utilities.Result;

@Service
public class MailValidation implements MailValidationService {

	@Override
	public Result validate(String email) {
		return new Result(true, email + ": Mail doğrulandı.");
	}

	@Override
	public boolean checkEmailDomain(String webAddress, String email) {
		return webAddress.contains(email.split("@")[1]);
	}

}
