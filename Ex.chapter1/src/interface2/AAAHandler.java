package interface2;

public class AAAHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa = new AA();
		BB bb = new BB();
		CC cc = new CC();
		DD dd = new DD();
		
		AAA a; //인터페이스 변수 선언
		//자동 형변환으로 인한 다형성
		a = aa;
		a = bb;
		a = cc;
		a = dd;
	}
}
