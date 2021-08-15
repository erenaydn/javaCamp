package homework5Eticaret.business.abstracts;

import homework5Eticaret.entities.concretes.User;

public interface UserService {
	void logIn(User user);

	void signUp(User user);

}
