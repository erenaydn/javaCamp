package kodlamaio.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms2.business.abstracts.UserService;
import kodlamaio.hrms2.core.dataAccess.UserDao;
import kodlamaio.hrms2.core.entities.User;
import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.core.utilities.SuccessDataResult;
import kodlamaio.hrms2.core.utilities.SuccessResult;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Kullanıcılar listelendi.");
	}

	@Override
	public Result add(User user) {
		

		this.userDao.save(user);
		return new SuccessResult("İş veren sisteme başarıyla kaydedildi.");
	}

}
