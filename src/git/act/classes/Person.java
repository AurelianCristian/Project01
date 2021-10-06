package git.act.classes;

public class Person {
	int id;
	String name;
    String Gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Gender=" + Gender + "]";
	}
    



}
