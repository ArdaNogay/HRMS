package ardanogay.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ardanogay.hrms.business.abstracts.JobPositionsService;
import ardanogay.hrms.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private JobPositionsService jobPositionsService;
	
	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}


	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		
		return this.jobPositionsService.getAll();
	}

}
