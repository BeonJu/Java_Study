package Object;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = new StringBuilder()  //체이닝 패턴
				.append("DEF")  // 문자열 끝에 추가
				.insert(0,"abc")  //문자열 지정 위치에 넣어줌
				.delete(0, 2)   //index 번호 시작, 끝
				.toString();  //완성된 문자열을 String 타입으로 리턴
				;
		System.out.println(data);
	}
}
