import java.util.*;

public class ListIteratorEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("toy", "box", "robot", "puzzle");
		
		System.out.println(list);
		
		list = new ArrayList<String>(list);
		
//		ListIterator : Iterator에 양방향 조회기능을 추가한 것. List를 구현한 경우만 사용 가능.
		ListIterator<String> it = list.listIterator();
		
//		-1-
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + "  ");
		}
		System.out.println();
		
//		-2-
		while(it.hasPrevious()) {
			String str = it.previous();
			System.out.print(str + "  ");
		}
		
//		-3- : -1-과 같은 기능.
		System.out.println();
		for(; it.hasNext();)
			System.out.print(it.next() + "  ");
	}
}
