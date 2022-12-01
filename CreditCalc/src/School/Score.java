package School;

public class Score {

	private int studentId;   //학번
	private Subject subject;  //과목
	private int point;  //점수

	public Score(int sudentId, Subject subject, int point) {
		this.studentId = sudentId;
		this.subject = subject;
		this.point = point;
		//생성자 겸 초기값 선언 부분
	}
	
	
	//학번 과목 점수 정보를 리턴해준다
	@Override
	public String toString() {
		return "학번:"+studentId + "," + subject.getSubjectName() + ":" + point;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}

	
	
	
	
}
