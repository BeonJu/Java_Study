package Interface;

public class MultiInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RC12 rc = new SmartTV();
		Searchable sc = new SmartTV();
		
		rc.turnOn();
		rc.turnOff();
		sc.Search("www.google.co.kr");
//		tv.Search("www.google.co.kr");
	}

}
