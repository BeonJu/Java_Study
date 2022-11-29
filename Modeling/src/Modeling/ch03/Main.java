package Modeling.ch03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Student s1 =  new Student("haseo");
			Student s2 = new Student("Beam");
			
			Course jv = new Course("Java");
			Course dp = new Course("Design Patten");
			
			Transcript tr1 = new Transcript(s1, jv);
			Transcript tr2 = new Transcript(s1, dp);
			Transcript tr3 = new Transcript(s2, jv);
			
			tr1.setDate("2022");
			tr1.setGrade("B0");
			
			tr2.setDate("2022");
			tr2.setGrade("D+");
			
			tr3.setDate("2023");
			tr3.setGrade("C+");
			
	}

}
