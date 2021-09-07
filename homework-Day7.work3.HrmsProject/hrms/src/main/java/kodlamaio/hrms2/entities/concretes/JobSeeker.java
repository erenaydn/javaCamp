package kodlamaio.hrms2.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_seekers")
public class JobSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "job_seeker_id")
	private int jobSeekerId;
	
	@NotNull
	@Column(name = "password")
	private String password;
	
	@NotNull
	@Column(name = "password_again")
	private String passwordAgain;

	@NotNull
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "identity_number")
	private String identityNumber;

	@NotNull
	@Column(name = "birth_date")
	private Date birthDate;

}
