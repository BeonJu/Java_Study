package Ex.chapter1_01;

public class SringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			String ssn  = "910404-122222";
////			charAt() 몇번째 값을 가져와서 변수에 넣어줌
////			char gender = ssn.charAt(6);
////			.substring() 문자열 절단 후 변수에 넣어줌 (시작점,어디까지) or (어디부터 끝까지)
//			String first = ssn.substring(0,6);
//			String second = ssn.substring(7);
//			
////			switch(gender) {
////			case '1':
////			case '3':
////				System.out.println("남자");
////				break;
////			case '2':
////			case '4':
////				System.out.println("여자");
////				break;
////			}
//			System.out.println(first);
//			System.out.println(second);
			
		
//		String old = "자바 문자열";
//		old.replace("자바", "JAVA") old에 있는 문자열을 다른 문자열로 변경
//		String newstr = old.replace("자바", "JAVA");
//		System.out.println(old);
//		System.out.println(newstr);
			
//			indexof() 해당 문자열이 왼쪽으로 부터 몇 번째 위치 인지 확인 후 변수에 넣어줌
//			String subject = "자바 프로그래밍";
//			int localtion = subject.indexOf("프로그래밍");
////			contains()는 해당 문자열을 subject에서 검열해서 결과 값을 boolean 형으로 반환 한다.
//			boolean sub = subject.contains("자바");
//			System.out.println(localtion);
//			System.out.println(sub);
			
			
		String board = "1,자바 학습,참조 타입 String 공부중";
		String[] tokens = board.split(",");
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
			
	}

}
