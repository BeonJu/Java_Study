package Q.ch6;

import java.util.Arrays;

public class Max {

	// max 메소드 작성

	static long max(int[] arr) {
//	int형은 Object가 아니라, 자바에서 기본적으로 제공하는 Data Type이다. 
//그러므로 int 형은 null로 초기화 할 수 없으며, null 체크 또한 불가능하다. 
//null 체크가 필요한 형식이 있다면 Integer형을 사용해야한다. 

		int tmp = 0;

		if (arr == null || arr.length == 0 ) {
			tmp = -999999;
			return tmp;
		}

		for (int i = 0; i < arr.length; i++) {
			if (tmp < arr[i]) {
				tmp = arr[i];
			}
		}

		return tmp;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
		System.out.println("최대값:" + max(null));
	}
}
