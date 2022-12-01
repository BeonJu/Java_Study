package SingleTon;

public class Printer {
	
	//프린터 객체는 무조건 이곳에서 하나만 생성되어야 함
	private static Printer printer = null;
	
	//생성자를 외부에서 호출 못하게 private로 지정
	private Printer() {}
	
	
	public static Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	
	//싱글톤의 이점: 메모리 측면에서 단 하나의 객채만 쓰니 공간적 이득,
	// 	         데이터 공유가 쉽다, 단! 동시에 접근 하게 되면 동시성 문제가 발생 할 수 있다.
	//             멀티스레딩 환경에서 발생할 수 있는 동시성 문제 해결을 위해 syncronized 키워드를 사용해야 한다.
	// 어플리케이션 전역에서 상태를 공유하기 때문에 테스트가 온전하게 수행되지 못한다.
	// 클라이언트가 구체 클래스에 의존하게 된다. new 키워드를 직접 사용하여 클래스 안에서 객체를 생성하고 있으므로, 이는 SOLID 원칙 중 DIP를 위반하게 되고 OCP 원칙 또한 위반할 가능성이 높다.
	// 자식클래스를 만들수 없다는 점과, 내부 상태를 변경하기 어렵다
	// 유연성이 많이 떨어지는 패턴
	//스프링 컨테이너 같은 프레임워크의 도움을 받으면 싱글톤 패턴의 문제점들을 보완하면서 장점의 혜택을 누릴 수 있다. 실제로 스프링 빈은 컨테이너의 도움을 받아 싱글톤 스콥으로 관리되고 있다.
}
