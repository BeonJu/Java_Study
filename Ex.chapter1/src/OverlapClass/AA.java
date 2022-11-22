package OverlapClass;

public class AA {
//	정적 멤버 클래스 public private default 
	static class BB {
		int field = 11111;
		BB(){
			System.out.println("퇴근");
		}
		void method2() {
			System.out.println("퇴근 퇴근");
		}
		
		
	}
//	인스턴스 필드로 사용
	BB field = new BB();
//	정적 필드로 사용
	static BB field2 = new BB();
	
//	생성자 사용
	AA(){
		BB b = new BB();
	}
	
//	인스턴스 메소스 사용
	void method1() {
		BB b = new BB();
	}
//	정적 메소스 사용
	static void method2() {
		BB b = new BB();
	}
	
	
	
	
	
	
	
}
