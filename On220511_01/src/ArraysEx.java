import java.util.*;

public class ArraysEx {
	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));
		System.out.println("arr2D를 toString()을 사용하여 출력하면 : " + Arrays.toString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, 3);
		int[] arr4 = Arrays.copyOf(arr1, 7);
		int[] arr5 = Arrays.copyOfRange(arr1, 2, 4); //2 ≤ index < 4
		int[] arr6 = Arrays.copyOfRange(arr1, 0, 7); //0 ≤ index < 7
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
//		fill() : 배열의 모든 요소를 지정된 값으로 채움
		Arrays.fill(arr7, 9); //arr7 = [9, 9, 9, 9, 9]
		System.out.println("arr7 = " + Arrays.toString(arr7));
//		setAll() : 배열을 채우는 데 사용할 함수형 인터페이스를 매개변수로 받음. 이 메서드를 호출할 때는
//		함수형 인터페이스를 구현한 객체를 매개변수로 지정하거나 람다식을 지정하여야 함.
		Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);
		}
		
		String[][] str2D1 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D1, str2D2)); //false
		System.out.println(Arrays.deepEquals(str2D1, str2D2)); //true
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After Sorting =");
		Arrays.sort(chArr); //정렬 순서 : 아스키코드 오름차순
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
	} //end of main
}
