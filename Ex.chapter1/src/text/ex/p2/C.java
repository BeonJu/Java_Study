package text.ex.p2;

import text.ex.p1.B;

public class C extends B {
//	A a = new A(); // A는 default 라 안됨
	B b = new B(); // B 클래스는 public 이라 됨
	b.getAA();
}
