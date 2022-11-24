package Object;

public class Member extends Object {

	public String id;

	public Member(String id) {
		this.id = id;
	}

//	논리적 동등 만들기
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member target = (Member) obj;
			if (id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}

//	public static void main(String[] args) {
//		Object obj1 = new Object();
//		Object obj2 = obj1;
//		
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj2 == obj1);//실제 값(힙영역)을 가르키는 주소값(스택영역 이자 ojb2,ojb1에 들어있는)을 비교
//		System.out.println(obj2.equals(obj1)); //실제 값(힙영역)을 가르키는 주소값(스택영역 이자 ojb2,ojb1에 들어있는)을 비교
//		System.out.println(obj1.equals(obj2)); 
//		//논리적 동등: 같은 객체든 다른 객체든 객체 저장 데이터가 동일아다.
//	}

}
