package School;

import java.util.ArrayList;


public class Student {
	private int studentId; //학번
	private String studentName;  //이름
	private Subject majorSubject;  //필수과목
	private ArrayList<Score> scoreList = new ArrayList<Score>();

	
	public Student(int studentId, String studentName, Subject majoSubject) {
		//생성자 및 값 초기화
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majoSubject;
	}
	
	//과목 점수 배열에 점수 추가
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	
	
	
}
