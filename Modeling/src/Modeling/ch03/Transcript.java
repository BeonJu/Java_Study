package Modeling.ch03;

public class Transcript {
	//연관 관계에 의한 참조하는 속성
	private Student student;
	private Course course;
	
	//Transcript 자체의 속성
	private String date;
	private String grade;
	
	public Transcript(Student student, Course course) {
		this.student = student;
		this.course = course;
		//this  = Transcript 자체 
		this.student.addTranscript(this);
		this.course.addTranscript(this);
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
