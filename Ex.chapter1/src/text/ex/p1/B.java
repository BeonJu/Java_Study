package text.ex.p1;



public class B {
	  // A class 는 default로 지정 되어 있어 같은 패키지에서 사용 가능
	
	public void BB() {
		A a = new A();
		a.setAA(55);
		System.out.println(a.getAA());
	}
	
	public int getAA() {
		A b = new A();
		
		return b.getAA();
	}
}

