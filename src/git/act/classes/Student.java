package git.act.classes;

import java.time.LocalDate;

import git.act.enums.Gender;
  

public class Student extends Person {
	Gender gender;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Student(int id, String firstName, String lastName, int age, LocalDate birthDate, Gender gender) {
		super(id, firstName, lastName, age, birthDate);
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [ Id=" + getId() + ", First Name=" + getFirstName()
				+ ",Last Name=" + getLastName() + ", BirthDate=" + getBirthDate() + ", Age=" + getAge()
				+ ", Gender=" + gender +"]";
	}

//	@Override
//	public String toString() {
//		return "Student [ Id= " + getId() + ", FirstName= " + getFirstName()
//				+ ", LastName= " + getLastName() + ", Age= " + getAge() + ", Gender= " + gender + "]";
//	}





}
