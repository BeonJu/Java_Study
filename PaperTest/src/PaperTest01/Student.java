package PaperTest01;

public class Student {

	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	public float getAverage() {
		return (this.kor + this.eng + this.math)/3;
	}
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
//	System.out.println("이름: " + this.name + " 반: " + this.ban + " 번호: " + this.no)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("김범주", 5, 12, 70, 70, 70);
		System.out.println(s1.name + " 학생의 합계: "+ s1.getTotal());
		System.out.println(s1.name + " 학생의 평균: "+ s1.getAverage());
	
	}

}
