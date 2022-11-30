package Generic5;

public class course {
	//모든 사람이 수강 신청 가능, 와일드 카드(?)
	public static void registerCourse1(App<?> app) {
		//해당 클래스 이름 가져 오기
		System.out.println(app.kind.getClass().getSimpleName()+"이 Course1를 등록.");
	};
	
	//학생만 수강신청 가능
	//자기 자신과 하위 클래스만 제네릭 타입으로 사용 가능, 타입 제한
	public static void registerCourse2(App<? extends Student> app) {
		System.out.println(app.kind.getClass().getSimpleName()+"이 Course2를 등록.");
	};
	
	//직장인 및 일반인만 수강신청 가능
	//자기 자신과 워커를 기준으로 부모 클래스만 제네릭 타입으로 사용 가능, 타입 제한
	public static void registerCourse3(App<? super Worker> app) {
		System.out.println(app.kind.getClass().getSimpleName()+"이 Course3를 등록.");
	};
}
