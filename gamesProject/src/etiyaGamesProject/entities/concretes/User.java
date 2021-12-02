package etiyaGamesProject.entities.concretes;

import etiyaGamesProject.entities.abstracts.Entity;

public class User implements Entity {

	private String nationalIdentityNumber;
	private String firstName;
	private String lastName;
	private int dateOfBirtday;
	private String gender;
	private double gamerPoint;

	public User() {
		super();
	}

	public User(String nationalIdentityNumber, String firstName, String lastName, int dateOfBirtday, String gender,
			double gamerPoint) {
		super();
		this.nationalIdentityNumber = nationalIdentityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirtday = dateOfBirtday;
		this.gender = gender;
		this.gamerPoint = gamerPoint;
	}

	public String getNationalIdentityNumber() {
		return nationalIdentityNumber;
	}

	public void setNationalIdentityNumber(String nationalIdentityNumber) {
		this.nationalIdentityNumber = nationalIdentityNumber;
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

	public int getDateOfBirtday() {
		return dateOfBirtday;
	}

	public void setDateOfBirtday(int dateOfBirtday) {
		this.dateOfBirtday = dateOfBirtday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getGamerPoint() {
		return gamerPoint;
	}

	public void setGamerPoint(double gamerPoint) {
		this.gamerPoint = gamerPoint;
	}

	@Override
	public String toString() {
		return "User [nationalIdentityNumber=" + nationalIdentityNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateOfBirtday=" + dateOfBirtday + ", gender=" + gender + ", gamerPoint=" + gamerPoint
				+ "]";
	}

}
