package homework5Eticaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework5Eticaret.dataAccess.abstracts.UserDao;
import homework5Eticaret.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(" Sisteme eklendi.");
		System.out.println("----hibernate");

	}

	@Override
	public void update(User user) {

	}

	@Override
	public void delete(User user) {

	}

	@Override
	public boolean emailGet(String email) {
		for (User user : users) {
			if (user.getEmailName() == email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getEmailPassword(String password) {
		for (User user : users) {
			if (user.getEmailPassword() == password) {
				return true;
			}
		}
		return false;
	}
}
