package git.act.main;

import java.util.LinkedList;
import java.util.List;
import git.act.classes.Student;
import git.act.classes.Teacher;
import git.act.enums.Gender;

public class Main {

	public static void main(String[] args) {
		// Student List
		List<Student> students = new LinkedList<Student>();
		Student s1 = new Student(101, "Todericiu", "Aurelian Cristian", 25, Gender.Female);
		students.add(s1);
		System.out.println(s1);
//    for(Student s:students) {
//    	System.out.println(s.getId()+" "+s.getFirstName()+" "+ s.getLastName()+" "+s.getAge()+" "+s.getGender());
//    }
		// Teacher List
		List<Teacher> teachers = new LinkedList<Teacher>();
		Teacher t1 = new Teacher(201, "Todericiu", "Aurelian Cristian", 29);
		teachers.add(t1);
		System.out.println(t1);
//    for(Teacher t:teachers) {
//    	System.out.println(t.getId()+" "+t.getFirstName()+" "+t.getLastName()+" "+t.getAge());
//    }

	}

}
