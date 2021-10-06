package git.act.classes;

public class Teacher extends Person {
	String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Teacher [title=" + title + ", id=" + id + ", name=" + name + ", Gender=" + Gender + "]";
	}

}
