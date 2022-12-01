package CreditClacs;

public class BasicEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {
		// TODO Auto-generated method stub
		
		String grade; // BasicEvaluation에서만 사용할 등급을 저장할 변수
		if(point >= 90 && point <= 100) {
			grade = "A";
		}else if(point >= 80 && point <= 89) {		
			grade = "B";
		}else if(point >= 70 && point <= 79) {		
			grade = "C";
		}else if(point >= 60 && point <= 69) {		
			grade = "D";
		}else{		
			grade = "F";
		}
		
		return grade;
	}

}
