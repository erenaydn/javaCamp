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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_experiences")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="experience_id")
	private int experienceId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name = "job_title")
    private String jobTitle;
	

	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;

}