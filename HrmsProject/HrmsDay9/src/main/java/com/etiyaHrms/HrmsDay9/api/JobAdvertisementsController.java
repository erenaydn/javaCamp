package com.etiyaHrms.HrmsDay9.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiyaHrms.HrmsDay9.business.abstracts.JobAdvertisementService;
import com.etiyaHrms.HrmsDay9.core.utilities.DataResult;
import com.etiyaHrms.HrmsDay9.core.utilities.Result;
import com.etiyaHrms.HrmsDay9.entities.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}

	@GetMapping("/getbyisactivetrue")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return this.jobAdvertisementService.getByIsActiveTrue();
	}

	@GetMapping("/getbyisactivetrueorderbyreleasedatedesc")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByReleaseDateDesc() {
		return this.jobAdvertisementService.getByIsActiveTrueOrderByReleaseDateDesc();
	}

	@GetMapping("/getByIsActiveTrueAndEmployer")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer(int employerId) {
		return this.jobAdvertisementService.getByIsActiveTrueAndEmployer(employerId);
	}

}
