package Ch01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WirteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//파일 export 스트림
			FileOutputStream fo = new FileOutputStream("C:/Temp/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			fo.write(a); //1 byte 씩 출력 buffer에 쌓임, buffer가 한계 넘게 쌓이면 출력됨
			fo.write(b);
			fo.write(c);
			
			fo.flush(); // ehco -> text1.db  // buffer clear 
			
			fo.close(); // 반드시 닫기
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
