package com.etiyaHrms.HrmsDay9.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiyaHrms.HrmsDay9.business.abstracts.CoverLetterService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.CoverLetter;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {

	private CoverLetterService coverLetterService;

	@Autowired
	public CoverLettersController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}

	@GetMapping("/getall")
	public DataResult<List<CoverLetter>> getAll() {
		return this.coverLetterService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);
	}
}
