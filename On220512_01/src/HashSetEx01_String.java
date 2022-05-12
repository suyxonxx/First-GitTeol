import java.util.*;

public class HashSetEx01_String {
	public static void main(String[] args) {
//		HashSet - 중복 X, 순서 X
		HashSet<String> set = new HashSet<String>();
		
		set.add("toy");
		set.add("box");
		set.add("robot");
		set.add("Box");
		set.add("toy");
		
		System.out.println("count : " + set.size());
		
//		-1. for문-
		for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();
		
//		-2. 향상된 for문-
		for(String s : set) {
			System.out.print(s + "  ");
		}
		
	} //end of main
}
