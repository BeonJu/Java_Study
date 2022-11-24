package Object;

public class HashcodeEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "김밥");
		Student s2 = new Student(1, "유부초밥");
		
		// 해시코드 : 객체를 식별하는 정수(객체의 메모리 번지를 이용해서 만들어진다.)
//		System.out.println(s1.hashCode() + ", " + s2.hashCode());
		if(s1.hashCode() == s2.hashCode()) {
			System.out.println("논리적으로 같다");
		}else {
			System.out.println("논리적으로 안 같다");
		}
		
	}
	
}
