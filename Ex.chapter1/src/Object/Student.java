package Object;

import java.util.Objects;

public class Student {

	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}


	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
		System.out.println("no:" + no + "   name: " + name.hashCode());
		int hashcode = no + name.hashCode(); //no, name이 동일하면 동일한 hashcode를 반환한다. 다만 프로세스 재 실행시에는 다른 hashcode를 반환한다.
		return hashcode;
	}


	@Override
	public boolean equals(Object obj) {
		//obj가 student 객체를 가지고 있나?
		if(obj instanceof Student) {
			Student target = (Student) obj;
			if(no == target.getNo() && name.equals(target.getName())){
				return true;
			}
		}
		return false;
	}
	

	
	
}
