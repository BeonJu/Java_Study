package school;

import java.util.ArrayList;
import utils.Define;


public class Subject {
/*
 【문항2】 아래 클래스 다이어그램과 내용을 참고하여 school 패키지의 Subject.java를 완성하시오. 
        - 필드 작성
        - 생성자 작성
        - 필드에 대한 getter, setter 메소드 작성
        - register() 메소드 작성: 매개변수로 받아온 student 객체를 ArrayList<Student>에 추가한다.
 */
	
	private String subjectName;
	private int subjectId;
	private int gradeType;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}
	public void register(Student student) {
		studentList.add(student);
	}
	public String getSubjectName() {
		return subjectName;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
}
