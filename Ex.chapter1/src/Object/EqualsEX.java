package Object;

public class EqualsEX extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		// Override 된 equals를 사용하게 되어 주소값 비교가 아닌 주소값이 가르키고 있는 실제 데이터값을 비교 한다.
		if(obj1.equals(obj2)) {System.out.println("같다");}else {System.out.println("다르다");}
	}

}
