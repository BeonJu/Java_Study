package Q.ch6;

public class Member {
	 String isName;
	 static String isID;
	 static String isPassword;
	 int isAge;
	

	public Member(String isName, String isID, String isPassword, int isAge) {
		// TODO Auto-generated constructor stub
		this.isName = isName;
		this.isID = isID;
		this.isPassword = isPassword;
		this.isAge = isAge;
	}

	public Member(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.isName = string;
		this.isID = string2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member user = new Member("김범주","Beom","12345",31);
		Member user1 = new Member("홍길동","hong");
		
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong","12345");
	
		if(result) {
			System.out.println("로그인 완료");
			System.out.println(user1.isID + "님이 로그아웃 되었습니다.");
		}else {
			System.out.println("ID 또는 Password가 올바르지 않습니다.");
		}
	
	}

	
	
	
	
}
