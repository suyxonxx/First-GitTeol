import java.util.*;

public class Wl220413_07 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int [10];
		int[] iArr2 = new int [10];
//		int[] iArr3 = new int [] {100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i = 0; i < iArr1.length; i++)
			iArr1[i] = i+1; //1 ~ 10의 숫자를 순서대로 배열에 넣음
		
		for (int i = 0; i < iArr2.length; i++)
			iArr2[i] = (int)(Math.random() * 10) + 1; //1 ~ 10의 값을 배열에 저장
		
		for (int i = 0; i < iArr1.length; i++)
			System.out.print(iArr1[i] + ", "); //배열에 저장된 값을을 출력
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
//		Arrays.toString은 [] 안에 배열에 저장된 값들을 주루룩 찍어줌
//		Arrays.toString 미사용 시, 주소값을 출력 (사실상 의미 없음)
//		But, char의 경우, 배열에 저장된 값들을 주루룩 찍어주긴 함
	}//end of main

}

