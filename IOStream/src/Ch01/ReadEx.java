package Ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read(); // 1byte 씩 read, empty 달성 시 -1 return
				System.out.println(data);
				
				if(data == (-1)) {break;}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
