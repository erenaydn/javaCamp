package kodlamaio.hrms2.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import kodlamaio.hrms2.entities.concretes.Employee;
import kodlamaio.hrms2.entities.concretes.Employer;
import kodlamaio.hrms2.entities.concretes.JobSeeker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", unique = true, updatable = false)
	private int userId;

	@NotNull
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "password")
	private String password;
	@JsonIgnore
	@OneToOne(mappedBy = "user")
	private Employer employer;
	@JsonIgnore
	@OneToOne(mappedBy = "user")
	private JobSeeker jobSeeker;
	@JsonIgnore
	@OneToOne(mappedBy = "user")
	private Employee employee;
}
