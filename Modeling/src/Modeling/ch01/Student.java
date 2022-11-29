package Modeling.ch01;

import java.util.Vector;

public class Student {
	private String name;
	//ArrayList 와 비슷 한 배열
	//course는 1..*
	private Vector<Course> courses; 
	
	public Student(String name){
		this.name = name;
		courses = new Vector<Course>();
	}
	
	//수강 신청
	public void registerCourse(Course course) {
		courses.add(course);
	};
	//수강 취소
	public void dropCourse(Course course) {
		courses.remove(course);
	};

}
