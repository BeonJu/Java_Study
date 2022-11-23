package Exception;

public class ExceptionCh01 {

	public static void printlength(String data) {
		
		
		//실행 예외
		try { //실행 시킬 코드 작성
		int result = data.length();
		System.out.println("문자 수 : " + result);
		} catch (NullPointerException e) { // try 부분에서 에러가 발생 했을 떄 실행 될 부분
			//예외가 발생한 이유에 대해서 return
//			System.out.println(e.getMessage());  
			//예외가 발생한 이유와 예외종류 대해서 return
//			System.out.println(e.toString());
			//예외가 발생한 이유와 예외종류 와 예외가 발생한 라인 까지 return
			e.printStackTrace();
		}finally { // finally는 선택적 사용이고 에러와 상관없이 무조건 실행 되는 부분
			System.out.println("마무리 실행\n");
		}
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작 \n");
		printlength("ThisisJava");
		printlength(null);
		System.out.println("프로그램 종료");
	}

}
