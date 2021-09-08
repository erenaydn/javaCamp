package kodlamaio.hrms2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms2.core.utilities.DataResult;
import kodlamaio.hrms2.core.utilities.Result;
import kodlamaio.hrms2.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertiesmentsController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertiesmentsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}

	@GetMapping("/getByActiveStatus")
	public DataResult<List<JobAdvertisement>> getByActiveStatus() {
		return this.jobAdvertisementService.getByActiveStatus();
	}
	
	@GetMapping("/getByActiveAndEmployerName")
	public DataResult<List<JobAdvertisement>> getByActiveAndEmployerName(@RequestParam String companyName) {
		return this.jobAdvertisementService.getByActiveAndEmployerName(companyName);
	}
	
	@GetMapping("/getByAscDate")
	public DataResult<List<JobAdvertisement>> getByAscDate() {
		return this.jobAdvertisementService.getByAscDate();
	}

}
