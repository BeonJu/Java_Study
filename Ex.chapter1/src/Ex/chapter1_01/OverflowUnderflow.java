package Ex.chapter1_01;

public class OverflowUnderflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byte1 = 125;
		
		//Overflow
		for(int i=0; i<5; i++) {
			byte1++;
			System.out.println("byte1: " + byte1);
		}
		
		//Underflow
		for(int i=0; i<5; i++) {
			byte1--;
			System.out.println("byte1: " + byte1);
		}
	}

}
