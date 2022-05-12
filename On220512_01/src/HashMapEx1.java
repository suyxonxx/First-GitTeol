import java.util.*;

public class HashMapEx1 {
	public static void main(String[] args) {
//		HashMap을 사용할 경우, 순서 없이 랜덤하게 출력되며
//		TreeMap을 사용할 경우, 오름차순으로 정렬된 순서로 출력됨
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(6, "Kim");
		map.put(3, "Kim");
		map.put(20, "Kim");
		map.put(13, "Kim");
		map.put(4, "Hong");
		map.put(4, "Lee");
		map.put(14, "Lee");
		map.put(5, "Park");
		map.put(15, "Park");
		map.put(4, "Choi");
		map.put(4, "Kim");
		
		System.out.println(map); //{3=Kim, 4=Lee, 5=Park, 6=Kim}
		System.out.println(map.get(5)); //Park
		
//		Set과 Map 모두 중복을 허용하지 않으므로 매칭이 가능함
		Set<Integer> set = map.keySet();
		for(Integer n : set) // key 출력
			System.out.print(n + "\t");
		System.out.println();
		
		for(Integer n : set) //value 출력
			System.out.print(map.get(n) + "\t");
		System.out.println();
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(map.get(itr.next()) + "\t");
		System.out.println();
	}
}
