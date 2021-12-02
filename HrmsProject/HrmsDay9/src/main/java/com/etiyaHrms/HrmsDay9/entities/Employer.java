package com.etiyaHrms.HrmsDay9.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employers")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobAdvertisements"})
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employer extends User{


	@NotNull
	@Column(name = "web_address")
	private String webAddress;

	@NotNull
	@Column(name = "company_name")
	private String companyName;

	@NotNull
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;

}
