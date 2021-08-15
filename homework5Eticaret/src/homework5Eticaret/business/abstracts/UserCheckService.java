package homework5Eticaret.business.abstracts;

import homework5Eticaret.entities.concretes.User;

public interface UserCheckService {

	boolean validateEmail(User user);

	boolean validateUser(User user);

	boolean checkNameandPassword(User user);

}
