package interface2;

//인터페이스와 클래스 간의 상속은 implements
public class InterfaceCImp implements C{

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("C 입니다.");
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("A 입니다.");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("B 입니다.");
	}

}
