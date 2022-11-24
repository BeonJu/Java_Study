package Object;

public class ExitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <10; i++) {
			System.out.println(i);
			
			if(i == 5) {
				System.out.println("종료 함");
				System.exit(0);
			}
		}
	}

}
