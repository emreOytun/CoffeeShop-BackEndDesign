package Entities;
import Abstract.Entity;

public class Customer implements Entity {
	public int Id;
	public String FirstName;
	public String LastName;
	public String DateOfBirth;
	public String Nationality;
	
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationality) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		Nationality = nationality;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	
}
