package Generic;

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<>();
		box1.content = "호울스";
		String str = box1.content;
		System.out.println(box1.content);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 123;
		int num = box2.content;
		System.out.println(num);
		
		
		
		
		
	}

}
