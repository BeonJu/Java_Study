package School;

import java.util.ArrayList;

public class School {
	//싱글톤 패턴
	private static School school = new School();

	
	private static String schoolName = "Good School";
	//학교에는 학생들과 과목들을 가지고 있음
	private ArrayList<Student> studentsList = new ArrayList<Student>();
	private ArrayList<Subject> subjectsList = new ArrayList<Subject>();

	//생성자, 싱글톤 패턴임으로 디폴트 생성자를 만들지 않기 위하여 private 생성자를 작성
	private School() {}
	
	//만약 school에 School생성을 하지 않아서 null 값인경우 생성하고 
	//	null값이 아닌 경우는 위에 생성자를 사용해서 만든 school을 getter 처럼 반환;
	public static School getSchool() {
		if(school == null) {
			school = new School();
		}
		return school;
	}

	public static String getSchoolName() {
		return schoolName;
	}


	
	public void addStudent(Student student) {
		studentsList.add(student);
	}
	
	public void addSubject(Subject subject) {
		subjectsList.add(subject);
	}
	
	
	public ArrayList<Student> getStudentsList() {
		return studentsList;
	}

	public ArrayList<Subject> getSubjectsList() {
		return subjectsList;
	}

	
	


	
	
	
	
	
	
}
