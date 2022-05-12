import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(; set.size() < 6;) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		System.out.println("정렬 전 : " + set);
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println("정렬 후 : " + list);
	}
}
