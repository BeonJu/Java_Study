package Q.ch6;

public class MemberService {
	String isID;
	String isPassword;
	


	public boolean login(String id, String password) {
		boolean result = (Member.isID == id && Member.isPassword == password);
		return result;
	}
}
