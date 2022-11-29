package Modeling.ch03;

import java.rmi.StubNotFoundException;
import java.util.Vector;

public class Course {
	private String name; //과목명
	private Vector<Transcript> transcripts;
	
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	public String getName() {
		return this.name;
	}
	//성적 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
}
