package kodlamaio.hrms2.core.validation.mail;

import kodlamaio.hrms2.core.utilities.Result;

public interface MailValidationService {
	Result validate(String email);
	boolean checkEmailDomain(String webAddress, String email);
}
