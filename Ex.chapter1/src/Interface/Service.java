package Interface;

public interface Service {
	//디폴트 메소드 
	default void deMethod1() {System.out.println("deMethod1");};
	default void deMethod2() {System.out.println("deMethod2");};
	
	//private 메소드
//	private void  priCommon1() {System.out.println("deMethod1");System.out.println("deMethod2");};
	
	
	//정적 메소드
	static void stMethod1() {System.out.println("stMethod1");};
	static void stMethod2() {System.out.println("stMethod2");};
	

}
