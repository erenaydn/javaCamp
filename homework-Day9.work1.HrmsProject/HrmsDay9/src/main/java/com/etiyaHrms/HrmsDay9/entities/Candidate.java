package com.etiyaHrms.HrmsDay9.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "schools", "jobExperiences", "languages",
		"socialMediaAccounts", "coverLetters", "images" })
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Candidate extends User {
	@NotNull
	@NotBlank
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@NotBlank
	@Column(name = "last_name")
	private String lastName;

	@NotNull
	@NotBlank
	@Column(name = "identity_number")
	private String identityNumber;

	@NotNull
	@NotBlank
	@Column(name = "birth_date")
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date birthDate;

	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<Cv> cvs;

	public Candidate(String email, String password, String firstName, String lastName, String identityNumber,
			Date birthDate) {
		super(email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}

}
