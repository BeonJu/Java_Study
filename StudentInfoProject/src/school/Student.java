package school;

import java.util.ArrayList;

public class Student {
	/*
	 【문항1】 아래 클래스 다이어그램을 참고하여 school 패키지의 Student.java를 완성하시오.
        - 필드 작성
        - 생성자 작성
        - 필드에 대한 getter, setter 메소드 작성
	 */
	
	private int studentId;
	private String studentName;
	private Subject majorSubject;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int studentId, String studentName, Subject majoSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majoSubject;
	}
	
	public void addSubjectScore(Score score){
		scoreList.add(score);
	}
	// Getter, Setter
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Subject getMajorSubject() {
		return majorSubject;
	}
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
}
