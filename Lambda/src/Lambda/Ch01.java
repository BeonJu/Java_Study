package Lambda;

public class Ch01  {
	
	public static void main(String[] args) {
		
	
	//하나 일 경우 {} 생략
	action((x,y) -> 
		System.out.println(x+y)
	);
	action((x,y) -> {
	System.out.println(x+y);
	System.out.println(x-y);
	}
);
	action1((x,y) -> {});
	
	
	

//	 action(new Calc() {
//
//		@Override
//		public void calc2(int x, int y) {
//			// TODO Auto-generated method stub
//			public void calc(int x, int y) {
//				System.out.println(x+y);
//			}
//		}
//		
//	});
	
	}

	public static void action(Calc calc) {
		int x = 10;
		int y = 4;
		calc.calc(x, y);
	}
	public static int action1(Calc calc) {
		int x = 10;
		int y = 4;
		calc.calc(x, y);
	}
	
}
