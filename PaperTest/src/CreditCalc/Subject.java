package CreditCalc;

import java.util.ArrayList;

public class Subject {
	protected String customerList;
	protected int subjectId;
	protected int gradeType;
	protected ArrayList<Student> studentList = new ArrayList<Student>();
	
	public void register(Student student) {
		studentList.add(student);
	}

}
