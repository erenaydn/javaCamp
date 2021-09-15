package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.core.utilities.results.Result;


@RestController
@RequestMapping("/api/jobAdvertisement") 
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getByActivatedTrue")
	public DataResult<List<JobAdvertisement>> getByActivatedTrue(){
		return this.jobAdvertisementService.getByActivatedTrue();
	}
	
	@GetMapping("/getByActivatedTrueOrderByReleaseDate")
	public DataResult<List<JobAdvertisement>> getByActivatedTrueOrderByReleaseDate(){
		return this.jobAdvertisementService.getByActivatedTrueOrderByReleaseDateDesc();
	}
	
	@GetMapping("/getByActivatedTrueAndEmployer_CompanyNameDataResult")
	public DataResult<List<JobAdvertisement>> getByActivatedTrueAndEmployer_CompanyNameDataResult(String companyName){
		return this.jobAdvertisementService.getByActivatedTrueAndEmployer_CompanyNameDataResult(companyName);
	}
  
}
