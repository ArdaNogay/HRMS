package ardanogay.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ardanogay.hrms.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions,Integer>{
	

}
