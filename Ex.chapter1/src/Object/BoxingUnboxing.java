package Object;

import org.w3c.dom.TypeInfo;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Integer obj = 100;//boxing 기본 타입의 값을 포장 객체로 만드는 것
			int value  = obj; // unboxing 포장 객체를 기본타입으로 만드는 것
			
			int value2 = obj + 5; // 5와 연산 되기 전에 obj는 언방식이 된다.
			
			
			System.out.println(obj.intValue());
			System.out.println(obj.getClass().getName());
	}

}
