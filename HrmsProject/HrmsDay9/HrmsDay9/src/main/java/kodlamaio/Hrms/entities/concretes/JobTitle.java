package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_titles")
public class JobTitle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_id")
	private int jobId;
	
	@Column(name="title")
	private String title;

}
