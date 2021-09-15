package kodlamaio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import kodlamaio.Hrms.core.entities.User;
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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobAdvertisements"})
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name="employer_id")
	private int employerId;
	
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
	@OneToOne()
	@JoinColumn(name = "user_id")
	private User user;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;

}
