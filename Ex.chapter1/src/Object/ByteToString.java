package Object;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String str = "겟바";
		
		byte[] arr1 = str.getBytes(); // UTF-8로 인코딩
		
		System.out.println(Arrays.toString(arr1));
		
		String str1 = new String(arr1, "UTF-8"); // UTF- 8로 디코딩
		System.out.println(str1);
	}

}
