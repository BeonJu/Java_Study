package interface2;

public class ExtendsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceCImp cimp  = new InterfaceCImp();
		C c = cimp; //자동 형변환
		c.methodA();
		c.methodB();
		c.methodC();
		cimp.methodA();
		cimp.methodB();
		cimp.methodC();
	
	}

}
