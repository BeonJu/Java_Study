package Exception;

public class ExceptionCh05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	findClass(); // 메로스를 호출한 곳에서 예외처리
	
} catch (ClassNotFoundException e) {
	// TODO: handle exception
		e.printStackTrace();
}	
	}

	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}


