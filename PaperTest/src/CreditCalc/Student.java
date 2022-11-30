package CreditCalc;

import java.util.ArrayList;

public class Student {
	protected int studentId;
	protected String studentName;
	protected Subject majorSubject;
	protected static ArrayList<Score> scoreList = new ArrayList<Score>();

	public static void addSubjectScore(Score score) {
		scoreList.add(score);

	}

}
