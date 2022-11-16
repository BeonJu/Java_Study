package Q.ch6;

public class isNumber {

	// isNumber 인스턴스 메소드 작성
	static boolean isNumber(String str) {
		boolean result = true;
		for (int i = 0; i < str.length(); i++) {
//			Character(string을 cahr 형식 처럼 한글자 한글자를 실행).isDigit(이것이 숫자이면)(str.charAt(i)(받은 변수 String str을 배열로만듬))
//			즉 str 배열에 문자형 숫자가 아닌 다른 문자형 데이터가 들이 있다면 boolean result를 false로 변경.
			if (!Character.isDigit(str.charAt(i))) {
				result = false;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
