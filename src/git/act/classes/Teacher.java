package git.act.classes;

import java.time.LocalDate;

import git.act.enums.Gender;

public class Teacher extends Person {
	Gender gender;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}



	public Teacher(int id, String firstName, String lastName, int age, LocalDate birthDate, Gender gender) {
		super(id, firstName, lastName, age, birthDate);
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Teacher [Id= " + getId() + ",FirstName= " + getFirstName() + ", LastName= " + getLastName()
				+ ", Age= " + getAge() +", Gender= " + gender + "]";
	}

}
