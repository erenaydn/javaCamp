package kodlamaio.Hrms.core.validation.mail;

import kodlamaio.Hrms.core.utilities.results.Result;

public interface MailValidationService {
	Result validate(String email);
	boolean checkEmailDomain(String webAddress, String email);
}
