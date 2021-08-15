package kodluyoruzioHomework3;

public class User {
	// fields
	private String userid;
	private String email;
	private String firstName;
	private String lastName;
	private String emailPassword;

	// constructors
	public User() {
			super();
		}

	public User(String userid, String email, String firstName, String lastName, String emailPassword) {
			super();
			this.userid = userid;
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailPassword = emailPassword;
		}

	// getters and setters
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}

}
