package school;

//어느 학생의 어느 과목 점수가 몇점이다.
public class Score {
	private int studentId;   
	private Subject subject; 
	private int point;     
	
	public Score( int studentId, Subject subject, int point){
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}

	public int getStudentId() {
		return studentId;
	}


	public Subject getSubject() {
		return subject;
	}

	public int getPoint() {
		return point;
	}





/*
 【문항3】 아래 클래스 다이어그램과 내용을 참고하여 Score.java에 toString()을 오버라이딩해 완성하시오.
        - toString() 메소드: Object에서 오버라이딩, “학번: 181213, 국어: 95” 형태의 문자열을 return 할 수 
          있도록 만든다.

 */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "학번:" + studentId+", "+"국어: " + point;
	}
}
