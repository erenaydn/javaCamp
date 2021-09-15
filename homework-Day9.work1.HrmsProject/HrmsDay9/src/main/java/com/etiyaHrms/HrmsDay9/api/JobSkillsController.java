package com.etiyaHrms.HrmsDay9.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiyaHrms.HrmsDay9.business.abstracts.JobSkillService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.JobSkill;

@RestController
@RequestMapping("/api/jobskills")
public class JobSkillsController {

	private JobSkillService jobSkillService;

	@Autowired
	public JobSkillsController(JobSkillService jobSkillService) {
		super();
		this.jobSkillService = jobSkillService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobSkill>> getAll() {
		return this.jobSkillService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobSkill jobSkill) {
		return this.jobSkillService.add(jobSkill);
	}

}
