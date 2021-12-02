package homework5Eticaret.entities.concretes;

import homework5Eticaret.entities.abstracts.Entity;

public class User implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String emailName;
	private String emailPassword;

	public User() {

	}

	public User(int id, String firstName, String lastName, String emailName, String emailPassword) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailName = emailName;
		this.emailPassword = emailPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmailName() {
		return emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}

}
