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
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="schools")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="school_id")
	@NotNull
	private int SchoolId;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotNull
	@Column(name="department")
	private String department;
	
	@NotNull
	@Column(name="is_graduate")
	private boolean isGraduate;
	
	@NotNull
	@Column(name="start_date")
	private Date startDate;
	
	@Column(name="graduation_date")
	private Date graduationDate;

	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;

	
	
	
}
