package Ch07;

public class Featurephone  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//phone에서 상속받은 필드 읽기, 자식 객채에서 부모 필드에 접근 가능
		Smartphone myPhone = new Smartphone("갤럭시","은색");
		System.out.println(myPhone.model + "," + myPhone.color);
		myPhone.bell();
		myPhone.sendvoice("안ㄴ");
		myPhone.receiveVoice("ㄴ하세요");
		myPhone.hangUp();
		
	}

}
