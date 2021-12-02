package com.etiyaHrms.HrmsDay9.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiyaHrms.HrmsDay9.business.abstracts.UserService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.SuccessDataResult;
import com.etiyaHrms.HrmsDay9.dataAccess.abstracts.UserDao;
import com.etiyaHrms.HrmsDay9.entities.User;

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

}
