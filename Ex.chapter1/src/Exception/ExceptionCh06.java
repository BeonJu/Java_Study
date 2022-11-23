package Exception;

public class ExceptionCh06 {
//																			메인 메소드는 JVM에서 실행 한다
	public static void main(String[] args) throws ClassNotFoundException { //메인 메소드에서 throws 사용시 JVM은 예외 내용을 콘솔에 출력한다. 
		// TODO Auto-generated method stub

	findClass(); // 메로스를 호출한 곳에서 예외처리
	}

	

	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}


