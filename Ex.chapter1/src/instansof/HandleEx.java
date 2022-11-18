package instansof;

public class HandleEx {
	public static void PInfo(P p) {
		System.out.println("name:" + p.name);
		p.walk();
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		P p = new P("Java");
//		PInfo(p);
		 
//		S s = new S(p.name, 10);
		P p = new S("Java", 10);
		
		if (p instanceof S) {
			//Student 객체일 경우 강제 타입 변환
			S ss = (S) p;
			//Student 객체만 가지고 있는 필드 및 메소드 사용
			System.out.println("studentNo: " + ss.SNum);
			PInfo(ss);
			ss.study();
		}
	}
}
