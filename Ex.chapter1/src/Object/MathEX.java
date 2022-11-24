package Object;

public class MathEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v1 = Math.ceil(5.3); // 올림
		double v2 = Math.floor(5.3);//반올림
		System.out.println(v1 + " , "+ v2);
		
		double v3 = Math.max(5, 3); 
		double v4 = Math.min(5, 3);
		System.out.println(v3 + " , "+ v4);
		
		double value = 12.3456;
		double temp = value * 100;
		System.out.println(temp);
		long temp2 = Math.round(temp); // 반올림
		System.out.println(temp2);
		double v5  = temp2 / 100.0;
		System.out.println(v5);
		
		
	}

}
