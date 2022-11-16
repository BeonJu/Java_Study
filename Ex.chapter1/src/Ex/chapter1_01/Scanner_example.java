package Ex.chapter1_01;

import java.util.Scanner;

public class Scanner_example {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("X값 입력: ");
			String strX = scan.nextLine();
			int x = Integer.parseInt(strX);

			System.out.println("Y값 입력: ");
			String strY = scan.nextLine();
			int y = Integer.parseInt(strY);

			int result = x + y;
			System.out.println("result: " + result);
			System.out.println();

			while (true) {
				System.out.println("입력 문자열: ");
				String data = scan.nextLine();

//			equals 비교, (data.equals("q")) data의 값이 q면 트루
				if (data.equals("q")) {
					System.out.println("data totall print out: " + data);
					break;
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}