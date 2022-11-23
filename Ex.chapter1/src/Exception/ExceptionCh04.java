package Exception;

public class ExceptionCh04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"100", "1oo", null, "200"};
		
		for(int i=0; i<=str.length; i++) {
			try {
				int value = Integer.parseInt(str[i]);
				System.out.println("str["+i+"]: "+value + "\n");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (NumberFormatException | NullPointerException e) { //두가지 이상 예외 처리
				// TODO: handle exception
				System.out.println("데이터에 문제가 있을 경우: " + e.getMessage() + "\n");
			}
		}
	}

}
