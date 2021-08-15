package homework5Eticaret.business.abstracts;

import homework5Eticaret.entities.concretes.User;

public interface EmailService {

	void sendMail(String mail);

	void verifyCheckMail(String email);

	boolean verificatedMail(String email);

	void sendMailwithUser(User user, String mail);
}
