package instansof;

public class S extends P{

//	F
	public int SNum;
	
//	C
	public S(String name, int snum) {
		super(name);
		this.SNum = snum;
	}
	
//	M
	public void study() {
		System.out.println("공부를 합니다.");
	}
	
}
