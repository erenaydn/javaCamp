package homework5Eticaret.dataAccess.abstracts;

import homework5Eticaret.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void update(User user);

	void delete(User user);

	boolean emailGet(String email);

	boolean getEmailPassword(String password);

}
