package git.act.classes;

import git.act.enums.Gender;

public class Student extends Person {
	Gender gender;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Student(int id, String firstName, String lastName, int age, Gender gender) {
		super(id, firstName, lastName, age);
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [gender=" + gender + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + "]";
	}

//	public Student(int id, String firstName, String lastName, int age) {
//		super(id, firstName, lastName, age);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "Student [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
//				+ ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}

}
