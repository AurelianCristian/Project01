package git.act.classes;

public class Teacher extends Person {

	public Teacher(int id, String firstName, String lastName, int age) {
		super(id, firstName, lastName, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAge()=" + getAge() + "]";
	}

}
