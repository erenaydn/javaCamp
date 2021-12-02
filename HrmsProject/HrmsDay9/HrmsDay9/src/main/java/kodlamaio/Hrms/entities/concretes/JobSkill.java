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
@Table(name="job_skills")
public class JobSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="skill_id")
	private int skillId;
	
	@Column(name="skill_name")
	private String skillName;
	

}
