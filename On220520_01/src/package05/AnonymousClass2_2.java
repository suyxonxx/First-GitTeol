package package05;

import java.util.*;

public class AnonymousClass2_2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("robot");
		list.add("apple");
		list.add("toy");
		
		Comparator<String> cmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
