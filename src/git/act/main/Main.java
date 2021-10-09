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
		Student s1 = new Student(101, "Todericiu", "Mihaiela Sorina", LocalDate.of(1996, 9, 9), Gender.Female);
		Student s2 = new Student(102, "Trifan", "Daniel", LocalDate.of(1992, 05, 19), Gender.Male);
		students.add(s1);
		students.add(s2);
		System.out.println(s1 + "\n" + s2 + "\n");
		// Traversing list
		System.out.println("Student list: ");
		for (Student s : students) {
			System.out.println(s.getId() + " " + s.getFirstName() + " " + s.getLastName() + " " + s.getAge());
		}

		// Teacher List
		List<Teacher> teachers = new LinkedList<Teacher>();
		Teacher t1 = new Teacher(201, "Todericiu", "Aurelian Cristian", LocalDate.of(1992, 4, 26), Gender.Male);
		teachers.add(t1);
		System.out.println("\n" + t1+ "\n");
		// Traversing list
		System.out.println("Teacher List: ");
		for (Teacher t : teachers) {
			System.out.println(t.getId() + " " + t.getFirstName() + " " + t.getLastName() + t.getAge() );
		}
		

	}

}
