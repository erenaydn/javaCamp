package kodlamaio.hrms2.entities.concretes;

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
@Table(name = "employers")
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "employer_id")
	private int employerId;
	
	@NotNull
	@Column(name = "password")
	private String password;
	
	@NotNull
	@Column(name = "password_again")
	private String passwordAgain;
	
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

}
