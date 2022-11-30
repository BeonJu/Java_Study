package Generic5;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//모든, 어떤 타입이든 다 선언 가능
		course.registerCourse1(new App<Person>(new Person()));
		
		//학생만
		course.registerCourse2(new App<Student>(new Student()));
		course.registerCourse2(new App<HighStudent>(new HighStudent()));
		course.registerCourse2(new App<MiddleStudent>(new MiddleStudent()));
		
		//직장인, 일반인
		course.registerCourse3(new App<Person>(new Person()));
		course.registerCourse3(new App<Worker>(new Worker()));
	}

}
