package com.etiyaHrms.HrmsDay9.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiyaHrms.HrmsDay9.business.abstracts.UserService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.entities.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/gelAll")
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}
}