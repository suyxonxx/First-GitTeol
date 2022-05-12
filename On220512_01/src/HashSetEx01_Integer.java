import java.util.*;

public class HashSetEx01_Integer {
	public static void main(String[] args) {
//		HashSet - 중복 X, 순서 X
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(5);
		set.add(3);
		
		System.out.println("count : " + set.size());
		
//		-1. for문-
		for(Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();
		
//		-2. 향상된 for문-
		for(Integer s : set) {
			System.out.print(s + "  ");
		}
		
	} //end of main
}
