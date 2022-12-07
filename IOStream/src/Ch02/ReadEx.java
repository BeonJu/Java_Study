package Ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			for(int i=0; i<data.length; i++) {
				int num = is.read(); // 1byte 씩 read, empty 달성 시 -1 return
				System.out.println(num + " " + data[i]);
				
				if(num == (-1)) {break;}
			}
			
			is.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
