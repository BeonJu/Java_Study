package interface3;

public class Bus implements Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 출발 합니다.");
	}
	
	public void checkFare() {
		System.out.println("승자요금 확인.");
		}
	

}
