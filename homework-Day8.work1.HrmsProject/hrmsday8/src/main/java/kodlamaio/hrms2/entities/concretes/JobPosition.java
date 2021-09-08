package kodlamaio.hrms2.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="job_position")
public class JobPosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="job_position_id")
	private int jobPositionId;
	
	@NotNull
	@Column(name="position_name")
	private String positionName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobPosition",cascade = CascadeType.ALL)
    private List<JobAdvertisement> advertisements;
}
