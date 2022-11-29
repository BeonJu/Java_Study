package Modeling.ch02;

import java.rmi.StubNotFoundException;
import java.util.Vector;

public class Course {
	private String name; //과목명
	private Vector<Student> students;
	
	public Course(String name) {
		this.name = name;
		students = new Vector<Student>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
}
