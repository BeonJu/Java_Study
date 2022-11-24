package Object;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 =  "고양이&강아지,호랑이";
		String data2 =  "고양이/강아지/호랑이";
//		String[] arr1 = data1.split("&|,");
//		for(String token : arr1) {
//			System.out.println(token);
//		}
		
	StringTokenizer st = new StringTokenizer(data2,"/");
	System.out.println(st.countTokens());
	while(st.hasMoreTokens()) {
		String token = st.nextToken();
		System.out.println(token);
	}
	}

}
