package Ex.chapter1_01;

public class Practice {

	public static void main(String[] args) {

		int sum = 0;
		for(int i=1; i>999; i++){
			if(i % 2 == 0) {
				sum += (-i);
			}else if(i % 2 != 0){
				sum += i;
			}else if(sum >= 100) {
				System.out.println("종료, " + sum);
				break;
			}
			System.out.println(sum);
		}
		
		
		}
	}


