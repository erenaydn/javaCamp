package etiyaGamesProject.dataAccess.conretes.jbdc;

import etiyaGamesProject.dataAccess.abstracts.UserDao;
import etiyaGamesProject.entities.concretes.User;

public class JbdcUserDao implements UserDao {

	@Override
	public void add(User entity) {
		System.out.println(" Jbdc  datasina eklendi user.");

	}

	@Override
	public void update(User entity) {
		System.out.println(" Jbdc  datasina güncellendi user.");
	}

	@Override
	public void delete(User entity) {
		System.out.println(" Jbdc  datasina silindi user.");

	}

}
