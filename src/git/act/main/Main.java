package git.act.main;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import git.act.classes.Student;
import git.act.classes.Teacher;
import git.act.enums.Gender;

public class Main {

	public static void main(String[] args) {
		// Student List
		List<Student> students = new LinkedList<Student>();
		Student s1 = new Student(101, "Todericiu", "Mihaiela Sorina", 25, LocalDate.of(1996, 9, 9), Gender.Female);
		students.add(s1);
		System.out.println(s1 + "\n");
		// Traversing list
		for (Student s : students) {
			System.out.println(s.getId() + " " + s.getFirstName() + " " + s.getLastName() + " " + s.getAge() + "\n");
		}

		// Teacher List
		List<Teacher> teachers = new LinkedList<Teacher>();
		Teacher t1 = new Teacher(201, "Todericiu", "Aurelian Cristian", 29, LocalDate.of(1992, 4, 26), Gender.Male);
		teachers.add(t1);
		System.out.println(t1 + "\n");
		// Traversing list
		for (Teacher t : teachers) {
			System.out.println(t.getId() + " " + t.getFirstName() + " " + t.getLastName() + " " + t.getAge() + "\n");
		}

	}

}
