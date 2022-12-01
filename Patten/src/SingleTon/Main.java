package SingleTon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] user = new User[10];// 유저 객채를 담을 배열 선언
		for(int i=0; i<user.length; i++) {
			user[i] = new User("User"+i); // 유저 객체 선언
			user[i].print();
		}
	
	}

}
