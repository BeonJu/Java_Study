package Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "java");
		map.put(2, "java");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println();
		map.put(1, "javas");
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		//key 변수 와 value를 받을 변수를 선언해서 받아오는게 보통
		
	}
	
	
	
}
