package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity

@Table(name = "positions")
@Data

public class JobPosition {

	@Id

	@GeneratedValue

	@Column(name = "position_id")
	private int positionId;

	@Column(name = "position_name")
	private String positionName;

}
