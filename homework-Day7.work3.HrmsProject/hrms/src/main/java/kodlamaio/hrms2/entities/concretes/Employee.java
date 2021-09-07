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
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "employee_id")
	private int employeeId;

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
	@Column(name = "position")
	private String position;

}
