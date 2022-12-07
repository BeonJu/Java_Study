package TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(7);
		scores.add(35);
		scores.add(21);
		scores.add(28);
		scores.add(14);
		
		for(Integer s : scores) {
			System.out.println(s + " "); //올림차순
		}
		
		
		
		System.out.println("Min Value:" + scores.first());
		System.out.println("Max Value:" + scores.last());
		System.out.println("5 < Value:" + scores.lower(8));
		System.out.println("5 >  Value:" + scores.higher(8));
		
		//내림차순
		NavigableSet<Integer> desc = scores.descendingSet();
		
		for(Integer s : desc) {System.out.print(s + " ");}
		
		//범위 검색 , boolean 값은 초과(false), 이상(true)
		NavigableSet<Integer> rangeSet = scores.tailSet(20, true);
		for(Integer s : rangeSet) {System.out.print(s + " ");}
		
		// 7 <=   &&     > 20
		NavigableSet<Integer> subRangeSet = scores.subSet(7, true, 20, false);
		for(Integer s : subRangeSet) {System.out.print(s + " ");}
		
		
	}

}
