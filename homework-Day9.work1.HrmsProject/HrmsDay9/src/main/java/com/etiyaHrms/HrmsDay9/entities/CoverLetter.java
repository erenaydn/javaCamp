package com.etiyaHrms.HrmsDay9.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cover_letters")
@AllArgsConstructor
@NoArgsConstructor
public class CoverLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cover_letter_id")
	private int coverLetterId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
		
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	private Cv cv;
	
}
