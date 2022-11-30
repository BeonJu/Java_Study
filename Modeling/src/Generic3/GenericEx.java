package Generic3;

public class GenericEx {

	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//T => Integer
		Box<Integer> box = boxing(100);
		int num = box.get();
		System.out.println(num);
		
		Box<String> box2 = boxing("도넛");
		String str = box2.get();
		System.out.println(str);
		
	}

}
