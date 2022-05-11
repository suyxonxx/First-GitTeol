import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("puzzle");
		
//		list, set, map
		for(String e : list)
			System.out.print(e + "  ");
		System.out.println(System.lineSeparator());
		
//		Object next() >> 다음값 반환
//		boolean hasNext() >> 가져올 데이터가 있는가
//		void remove >> next()호출을 통해 반환된 인스턴스 삭제
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext()) {
			String str1 = it1.next();
			if(str1.equals("toy")) it1.remove();
			System.out.print(str1 + "  ");
		}
		System.out.println(System.lineSeparator());

		Iterator<String> it2 = list.iterator();
		while(it2.hasNext()) {
			String str2 = it2.next();
			if(str2.equals("toy")) it2.remove();
			System.out.print(str2 + "  ");
		}
		System.out.println(System.lineSeparator());
	} //end of main
}
