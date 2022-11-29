package PaperTest01;

public class Ch01 {

	
//	1.	변수 int num=10이  ‘양수’, ‘음수’, ‘0’인지 출력하는 코드를 자바로 작성하시오.
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		
		String result = (num >= 1) ? "양수" : (num == 0) ? "0" : "음수";
		
		System.out.println("결과 값: " + result);
		
		
		
	}

}
