package com.etiyaHrms.HrmsDay9.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiyaHrms.HrmsDay9.business.abstracts.LanguageService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public DataResult<List<Language>> getAll() {
		return this.languageService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
}
