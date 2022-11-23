package Exception;

public class ExceptionCh02 {
	
	public static void main(String[] args) {
		//실행 예외는 try/catch 아니여도 됩니다, 다만 일반 예외는 반드시 try/catch문을 사용해 주어야 합니다.
		try {
			Class.forName("java.lang.String"); // 주어진 클래스를 찾는 코드
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
