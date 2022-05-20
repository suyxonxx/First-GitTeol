package package04;

import java.util.*;

class StrCmp implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
}

public class AnonymousClass_2_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("robot");
		list.add("apple");
		list.add("toy");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		StrCmp sc = new StrCmp();
		
		Collections.sort(list, sc);
		System.out.println(list);
		
	}
}
