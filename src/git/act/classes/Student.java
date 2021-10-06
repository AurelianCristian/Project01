package git.act.classes;

public class Student extends Person {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + ", Gender=" + Gender + "]";
	}

}
