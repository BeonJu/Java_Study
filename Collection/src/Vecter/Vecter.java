package Vecter;

import java.util.List;
import java.util.Vector;

public class Vecter {

	public static void main(String[] args) {
		Vector<Board> list  = new Vector<>();
		
		Thread thread1 = new Thread() {

			@Override
			public void run() {
				for(int i=0; i <= 1000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
			
		};
		
		
		Thread thread2 = new Thread() {

			@Override
			public void run() {
				for(int i=0; i <= 2000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
			
		};
	
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		thread1.start();
		thread2.start();
		
		
		//작업 스레드들이 작업 종료 될때 까지 메인 스레드를 기다리게 하는 기능
		
		int size = list.size();
		System.out.println("객채 수 : " + size);
		System.out.println();
		
	}
	
	
}
