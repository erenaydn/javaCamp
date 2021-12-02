package com.etiyaHrms.HrmsDay9.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cvs")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cv_id")
	private int cvId;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@OneToMany(mappedBy = "cv") 
	private List<CoverLetter> coverLetters;
	
	@OneToMany(mappedBy = "cv") 
	private List<Image> images;
	
	@OneToMany(mappedBy = "cv")
	private List<SocialMediaAccount> socialMediaAccounts;
	
	@OneToMany(mappedBy = "cv")
	private List<School> schools;
	
	@OneToMany(mappedBy = "cv")
	private List<JobExperience> jobExperiences;
	
	@OneToMany(mappedBy = "cv")
	private List<JobSkill> jobSkills;
	
	@OneToMany(mappedBy = "cv")
	private List<Language> languages;


}
