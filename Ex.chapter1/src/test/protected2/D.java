package test.protected2;

import test.protected1.A;

public class D extends A {
	public void method() {
		super.field = "B";
		this.field = "C";
	}
	
	// protected 사용시 직접 객체를 생성해서는 사용할수는 없다.
}

