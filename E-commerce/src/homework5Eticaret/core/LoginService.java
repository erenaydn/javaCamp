package homework5Eticaret.core;

import homework5Eticaret.entities.concretes.User;

public interface LoginService {
	void logIn(User user);

	void signUp(User user);

}
