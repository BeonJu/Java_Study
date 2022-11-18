package Ch07;

public class CalcAddCom {
	

	public static void main(String args[]) {
		int r = 10;
		
		Calculator clac = new Calculator();
		System.out.println(clac.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(r));
	}

}
