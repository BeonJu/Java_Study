package Ex.chapter1_01;

import java.util.Scanner;

public class Keycontrol {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			boolean run = true;
			int speed = 0;
			
			while(run) {
				System.out.println();
				System.out.println("  1. 증속  |  2. 감소  |  3. 종료");
				System.out.println("선택 : ");
				String scanNum = scan.nextLine();
				
				if(scanNum.equals("1")) {
					speed++;
					System.out.println("속도 : " + speed);
				}else if(scanNum.equals("2")) {
					speed--;
					System.out.println("속도 : " + speed);
				}else if(scanNum.equals("3")) {
					run = false;
					System.out.println("속도 : " + speed);
					System.out.println("종료 되었습니다.");
					
				}
			}
		}
	}

}
