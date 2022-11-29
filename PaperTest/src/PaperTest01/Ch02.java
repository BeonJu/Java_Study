package PaperTest01;

public class Ch02 {

//	2.	int [] arr = {10, 20, 30, 40, 50} 의 합과 평균을 출력하는 자바 코드를 작성하시오. . 
	
	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		int arg = 0;
		
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		arg = sum / arr.length;
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + arg);
		
	}
}
