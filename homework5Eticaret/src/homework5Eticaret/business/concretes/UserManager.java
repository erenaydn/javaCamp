package homework5Eticaret.business.concretes;

import homework5Eticaret.business.abstracts.EmailService;
import homework5Eticaret.business.abstracts.UserCheckService;
import homework5Eticaret.business.abstracts.UserService;
import homework5Eticaret.dataAccess.abstracts.UserDao;
import homework5Eticaret.entities.concretes.User;

public class UserManager implements UserService {

	private UserCheckService checkUser;
	private EmailService checkEmail;
	private UserDao checkUserDao;

	public UserManager(UserCheckService checkUser, EmailService checkEmail, UserDao checkUserDao) {

		this.checkUser = checkUser;
		this.checkEmail = checkEmail;
		this.checkUserDao = checkUserDao;
	}

	@Override
	public void logIn(User user) {
		if (checkUserDao.emailGet(user.getEmailName()) && checkUserDao.getEmailPassword(user.getEmailPassword())
				&& checkEmail.verificatedMail(user.getEmailName())) {
			System.out.println(" Giriþ baþarýlý . ");

		} else if (checkEmail.verificatedMail(user.getEmailName()) == false) {
			System.out.println(" E- mailiniz gözden geciriniz ");
		} else {
			System.out.println(" Girilen bilgileri tekrar gozden geciriniz.");
		}

		System.out.println("---- logIn");
	}

	@Override
	public void signUp(User user) {
		if (checkUser.checkNameandPassword(user) && checkUser.validateEmail(user)
				&& checkUser.validateUser(user) == true) {
			System.out.println("Kullanýcý eklendi ");
			System.out.println(" ---- signup ");
			checkEmail.sendMailwithUser(user, user.getEmailName());
			checkUserDao.add(user);
		} else {
			System.out.println(" kayýt baþarýsýz");
			System.out.println(" ---- signup ");
		}
	}

}
