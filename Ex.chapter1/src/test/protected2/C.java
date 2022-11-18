package test.protected2;

import test.protected1.A;

public class C {
	public void method() {
		A a = new A();
		a.method();
		a.field = "A";
	}
}
