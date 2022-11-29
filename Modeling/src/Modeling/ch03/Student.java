package Modeling.ch03;

import java.util.Vector;

public class Student {
	private String name;
	//ArrayList 와 비슷 한 배열
	//course는 1..*
	private Vector<Transcript> transcripts; 
	
	public Student(String name){
		this.name = name;
		transcripts = new Vector<Transcript>();
	}

	//성적 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

}
