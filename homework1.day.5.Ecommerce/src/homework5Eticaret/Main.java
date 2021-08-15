package homework5Eticaret;

import homework5Eticaret.business.abstracts.UserService;
import homework5Eticaret.business.concretes.EmailManager;
import homework5Eticaret.business.concretes.UserCheckManager;
import homework5Eticaret.business.concretes.UserManager;
import homework5Eticaret.core.LoginManagerAdapter;
import homework5Eticaret.core.LoginService;

import homework5Eticaret.dataAccess.concretes.HibernateUserDao;
import homework5Eticaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new UserCheckManager(), new EmailManager(), new HibernateUserDao());

		LoginService logService = new LoginManagerAdapter();

		User dogruUser = new User(1, "Eren", "Aydýn", "deneme4@gmail.com", "123647");
		User yanlismailuser = new User(2, "Özge", "Selvi", "ya!s.+.yanlis@gmail.com", "123456");
		User yanlissifreuser = new User(3, "Emre", "Derya", "deneme2@gmail.com", "1234");
		userService.signUp(dogruUser);
		userService.signUp(yanlismailuser);
		userService.signUp(yanlissifreuser);
		
		userService.logIn(yanlissifreuser);
		userService.logIn(dogruUser);
		
		
		logService.logIn(dogruUser);

	}

}
