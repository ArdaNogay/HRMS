package ardanogay.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table(name="jobpositions")
@Data

public class JobPositions {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	public JobPositions() {}
	
	public JobPositions(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	
}
