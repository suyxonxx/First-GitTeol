import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog","lion", "tiger"};
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr); //대소문자 구분 O
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자 구분 X
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); //역순 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
	} //end of main
} //end of public class

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
//			기본 정렬 방식의 역순으로 정렬하기 위한 방법으로 -1을 곱하는 것을 택한 것.
			return c1.compareTo(c2) * -1;
		}
		return -1;
	} //end of compare
} //end of class Descending
