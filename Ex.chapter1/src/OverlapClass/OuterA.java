package OverlapClass;

public class OuterA {
	int field1;
	void method() {}
	
	static int field2;
	static void method1() {}
	
	class B{
	B b = new B();
	int fieldB;
	void methodB() {
		field1 = 10;
		method();

		field2 = 15;
		method1();
	}
	}
	
	static class C{

	int fieldB;
	void methodB() {
//		아래 사용 불 
//		field1 = 10;
//		method();

		field2 = 15;
		method1();
	}
	
	
	}

}
