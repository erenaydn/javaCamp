package com.etiyaHrms.HrmsDay9.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobAdvertisement {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private JobTitle jobTitle;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	@Column(name = "min_salary")
	private double minSalary;

	@Column(name = "max_salary")
	private double maxSalary;

	@Column(name = "open_position_count")
	private int openPositionCount;

	@JsonFormat(pattern = "yyyy-mm-dd")
	@Column(name = "release_date")
	private Date releaseDate;

	@JsonFormat(pattern = "yyyy-mm-dd")
	@Column(name = "application_deadline")
	private Date applicationDeadline;

	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;

	@Column(name = "is_active", columnDefinition = "boolean default false")
	private boolean isActive;
	
}
