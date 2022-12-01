package CreditCalcResult;



import java.util.ArrayList;


import CreditClacs.BasicEvaluation;
import CreditClacs.GradeEvaluation;
import CreditClacs.MajorEvaluation;
import School.School;
import School.Score;
import School.Student;
import School.Subject;
import Utils.Define;

public class CreditCalcResult {
	// 싱글톤 school의 주소값을 넣어주는 건가? static school 변수 이기 때문에 객체 호출
	School school = School.getSchool();
	

	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 | 필수과목 | 점수 \n";
	public static final String LINE = "----------------------------------\n";

	// StringBuffer와 StringBuilder는 concat 혹은 +를 하지 않으려고 사용하는 것
	// .concat 혹은 +를 이용한 값 변경은 기존 String에 들어있던 값을 버리고
	// 새로 값을 할당하는 것임으로 퍼포먼스가 안 좋다.
	private StringBuffer buffer = new StringBuffer();

	public String getCreditCalcResult() {
		// App.school에서 과목 생성하고 school.ArrayList<subjectsList> getter
		ArrayList<Subject> subjectsList = school.getSubjectsList();
		for (Subject subject : subjectsList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
			
		}
		return buffer.toString();
	}
	
	
	public void makeHeader(Subject subject) {
		buffer.append(CreditCalcResult.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(CreditCalcResult.TITLE);
		buffer.append(CreditCalcResult.HEADER);
		buffer.append(CreditCalcResult.LINE);
	}

	public void makeBody(Subject subject) {
		// 과목을 수상신청한 학생들의 리스트 getter
		ArrayList<Student> studentsList = subject.getStudentList();
		
		for (int i = 0; i < studentsList.size(); i++) {
			Student student = studentsList.get(i);

			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append(" | ");

			//학생별 수강과목 점수 계산위해서 학생 객체와 과목Id input
			getScoreGrade(student, subject.getSubjectId());
		}
	}

	public void getScoreGrade(Student student, int subjectId) {

		// 해당 학생이 수강한 과목의 점수 리스트 호출
		ArrayList<Score> scoresList = student.getScoreList();
		//해당 학생의 전공 과목의 과목 코드
		int majorId = student.getMajorSubject().getSubjectId();

		// 학점 평가
		GradeEvaluation[] gradeEvaluations = { new BasicEvaluation(), new MajorEvaluation() };
// -----------------------------> 이해력 떨어짐으로 코드 자세히 확인 할 부분
		
		for (int i = 0; i < scoresList.size(); i++) {
			Score score = scoresList.get(i);
			//점수의 과목id(국어인지 수학인지 확인)을 가져와서 인자값으로 받은 과목 id와 비교
			if (score.getSubject().getSubjectId() == subjectId) { // 학점 산출할 과목ID 찾기
				String grade;
				//과목id 검증이 끝난 과목id를 해당 학생의 필수 과목인지 아닌지 비교
				if (score.getSubject().getSubjectId() == majorId) { // 점수의 과목이 필수 과목인 경우
					//전공 과목이면 전공 과목 계산 방식 사용
					grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
				} else {
					//전공 과목이 아니면 일반 과목 계산 방식 사용
					grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
				}
// ----------------------------->
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | \n");
			}
		}
	}

	public void makeFooter() {
		buffer.append("\n");
	}

}
