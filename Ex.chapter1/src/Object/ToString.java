package Object;

import Ch07.Smartphone;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone  myPhone = new SmartPhone("삼성전자", "안드로이드");
		//toString 객체의 문자정보를 리턴을 한다
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
		try {
			int value  = Integer.parseInt("1oo");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("에러입니다");
		}
		
		
	}

}
