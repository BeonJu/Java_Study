package Ex.chapter1_01;

public class Acc {
	public static void main(String[] args) {
		int a = 1;
		double b = 0.1;
		int num = 7;

		double result = a - num * b;
		System.out.println(result);

		int x = 5;
		int y = 0;
		System.out.println(String.format("%.4f", x / (double) y));
	}
}
