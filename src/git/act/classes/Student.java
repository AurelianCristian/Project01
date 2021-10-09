package git.act.classes;

import java.time.LocalDate;
import java.time.Period;

import git.act.enums.Gender;

public class Student extends Person {
	int age;
	Gender gender;

	public int getAge() {
		LocalDate today = LocalDate.now();
		age = Period.between(getBirthDate(), today).getYears();
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Student(int id, String firstName, String lastName, LocalDate birthDate, Gender gender) {
		super(id, firstName, lastName, birthDate);
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [  Id=" + getId() + ", First Name=" + getFirstName() + ", Last Name="
				+ getLastName() + ", Gender=" + gender + ", Birth Date=" + getBirthDate() + ", Age=" + getAge()
				+ "]";
	}

}
