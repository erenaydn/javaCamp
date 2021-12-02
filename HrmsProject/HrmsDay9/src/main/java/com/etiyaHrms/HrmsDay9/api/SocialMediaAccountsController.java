package com.etiyaHrms.HrmsDay9.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiyaHrms.HrmsDay9.business.abstracts.SocialMediaAccountService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.SocialMediaAccount;

@RestController
@RequestMapping("/api/socialmediaaccounts")
public class SocialMediaAccountsController {

	private SocialMediaAccountService socialMediaAccountService;

	@Autowired
	public SocialMediaAccountsController(SocialMediaAccountService socialMediaAccountService) {
		super();
		this.socialMediaAccountService = socialMediaAccountService;
	}

	@GetMapping("/getall")
	public DataResult<List<SocialMediaAccount>> getAll() {
		return this.socialMediaAccountService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody SocialMediaAccount socialMediaAccount) {
		return this.socialMediaAccountService.add(socialMediaAccount);
	}

}
