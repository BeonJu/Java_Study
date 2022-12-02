package Set;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("java1");
		set.add("java");
		
		System.out.println(set.size());
		System.out.println(set.toString());
		
	}

}
