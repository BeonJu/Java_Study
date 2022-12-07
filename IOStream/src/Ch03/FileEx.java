package Ch03;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("C:/Temp/images");  // 파일 경로 객체 생성
		File file1 = new File("C:/Temp/file1.txt"); // 파일 경로 객체 생성
		File file2 = new File("C:/Temp/file2.txt"); // 파일 경로 객체 생성
		
		if(dir.exists() == false) {dir.mkdir();} // 파일 없으면 생성
		if(file2.exists() == false) {file2.createNewFile();} // 파일 없으면 생성
		
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles(); // 해당 폴더에 있는 파일 리스트를 객체로 가져온다.
		
		for(File file : contents) {
			if(file.isDirectory()) {
				System.out.println(file.getName());
			}else {System.out.println(file.getName());
				
			}
		}
	}

}
