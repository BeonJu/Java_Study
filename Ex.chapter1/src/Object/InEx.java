package Object;

import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			//enter 키를 읽지 않았을때 실행
			if(keycode != 13 && keycode != 10) {
				if(keycode == 49) {
					speed++;
					}else if(keycode == 50) {
						
					}else if(keycode == 51) {
						break;
					}
				
				
			}
			
			
			System.out.println("1. 증속    2. 감속    3.중지");
			System.out.println("현재속도: " + speed);
			System.out.println("선택: ");
			keycode = System.in.read();
		}
	}

}
