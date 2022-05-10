import java.util.*;

public class ArrayListLinkedListTest {
	public static void main(String[] args) {
//		아래에서 List type의 참조변수가 ArrayList, LinkedList 클래스의 인스턴스를 참조할 수 있는 이유
//		: ArrayList, LinkedList 클래스 모두 계보를 거슬러 올라가다 보면, List 인터페이스를 구현한 추상클래스인
//		AbstractList의 하위 클래스를 상속한 자녀 클래스들이기 때문이다.
		
//		추가할 데이터의 개수를 고려하여 충분히 잡아야 한다.
		List al = new ArrayList(2000000);
		List ll = new LinkedList();
		
		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList : " + add1(al));
		System.out.println("LinkedList : " + add1(ll));
		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList : " + add2(al));
		System.out.println("LinkedList : " + add2(ll));
		System.out.println();
		System.out.println("= 중간에서 삭제하기 =");
		System.out.println("ArrayList : " + remove2(al));
		System.out.println("LinkedList : " + remove2(ll));
		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList : " + remove1(al));
		System.out.println("LinkedList : " + remove1(ll));
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i = list.size() - 1; i >= 0; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++) list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
/*
 * <결론>
 * 순차적으로 데이터를 추가 / 삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다.
 * 중간에 데이터를 추가 / 삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다.
 * (교재 601p 참고)
 * 
 * <학원컴 결과>
 * = 순차적으로 추가하기 =
 * ArrayList : 162
 * LinkedList : 238
 * 
 * = 중간에 추가하기 =
 * ArrayList : 4340
 * LinkedList : 12
 * 
 * = 중간에서 삭제하기 =
 * ArrayList : 3620
 * LinkedList : 122
 * 
 * = 순차적으로 삭제하기 =
 * ArrayList : 11
 * LinkedList : 28
 * 
 * <내 노트북 결과>
 */