package kodlamaio.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_advertisement_id")
	private int jobAdvertisementId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "job_id")
	private JobTitle jobTitle;

	@Column(name = "description")
	private String description;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	@Column(name = "min_salary")
	private double minSalary;

	@Column(name = "max_salary")
	private double maxSalary;

	private int openPositionCount;

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-mm-dd")
	@Column(name = "release_date")
	private Date releaseDate;

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-mm-dd")
	@Column(name = "application_deadline")
	private Date applicationDeadline;

	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;

	@JsonIgnore
	@Column(name = "activated")
	private boolean activated;

}
