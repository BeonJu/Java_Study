package ClassStatic;

public class PracticeStatic {
//	static double p = 3.14159;
//	static String model = "cal";
//	static String number = "1";
//	static String info;
////	Static을 붙여 준다면 스택과 힙 영역을 벗어나 개인적인 Static 영역에서 선언 된다.
////	또 한 타 메소드, 타 클래스에서 접근 및 수정이 가능 하다.
////	static 메소드에서는static변수만사용할수있다.
////	static 메소드에서는인스턴스변수는사용할수없다.
////	static 선언 과 동시에 값 초기화를 해주는걸 추천
////	static {} 정적 필드 info 같이 static 필드 초기화를 위하여 사용
//	static {
//		info = model + "_" + number;
//	}

	// int speed는 인스턴스 필드
	
	
//	런타임 시 인스턴스가 실제로 참조하고 있는 클래스를 찾아가는 것이 아니라 컴파일 시 결정된 클래스를 찾아가기 때문에 이와 같은 상황이 발생하는데요,
//	어떤 메서드를 호출할지 결정하여 실제로 호출시키는 과정을 메서드 디스패치라고 합니다.
//
//	자바는 런타임 시 객체를 생성하고, 컴파일 시에는 생성할 객체 타입에 대한 정보만 보유합니다.
//	이 과정은 static (정적)과 dynamic (동적)으로 구분할 수 있습니다.
//
//	정적 디스패치 : 컴파일 시점에서 컴파일러가 특정 메소드를 호출할 것이라고 명확하게 알고있는 경우
//	동적 디스패치 : 정적 디스패치와 반대로 컴파일러가 어떤 메서드를 호출하는지 모르는 경우. 동적 디스패치는 호출할 메서드를 런타임 시점에서 결정한다.
//
//	오버라이딩이 런타임 시점에 이루어지는 동적 디스패치이고, static 은 컴파일 시점에 이루어지므로 애초에 런타임 시점이 오버라이딩과 어울릴 수 없습니다.
//
//	또한 오버라이딩은 클래스의 객체에 달려있는데, 객체지향에서 오버라이딩의 포인트는 클래스를 자식 클래스화 할 수 있고, 
//	자식 클래스의 객체는 부모 클래스의 동일한 메서드에 대해서 다른 동작을 하여 다형성을 보장하는 것입니다.
//
//	반면 static 키워드를 사용한다면 하나를 공유하여 사용한다는 개념이므로 객체가 생성되기도 전에 미리 만들어져 있습니다.
	
	int speed;

	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "k/m으로 질주 중!");
	}

	// 정적 메소드
	static void simulate() {
//		클래스 안에서 정적 메소드에서 자기 자신인 클래스를 생성자 선언이 가능합니다.
		PracticeStatic myCar = new PracticeStatic();

		myCar.speed = 200;
		myCar.run();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main의 myCar 선언 전 이기 때문에 static Method의 simulate를 불러 온다.
		simulate();
		
		PracticeStatic myCar = new PracticeStatic();
		 
		myCar.speed = 60;
		myCar.run();
		//static 메소스안에 선언 된 myCar
		PracticeStatic.simulate();
		
	}
}
