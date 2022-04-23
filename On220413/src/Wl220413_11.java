import java.util.*;

public class Wl220413_11 {

	public static void main(String[] args) {
		
////		정수형 배열 5개 선언
////		초기화는 랜덤함수를 통해서 1 ~ 100 사이값을 저장 및 출력
//		int[] num = new int[5];
//		
//		for(int i = 0; i < num.length; i++)
//			num[i] = (int)(Math.random() * 99) + 1;
//		
//		System.out.println(Arrays.toString(num));
//		
////		최대값 및 최소값 계산 및 출력
////		int max = 0;
////		int min = max;
//		
//		int max = num[0];
//		int min = num[0];
//		
////		1. 최대값
//		for (int i = 0; i < num.length; i++) {
//			if (max < num[i])
//				max = num[i];
//		}
//		System.out.println("max : " + max);
//		
////		2. 최소값
//		for (int i = 0; i < num.length; i++) {
//			if (min > num[i])
//				min = num[i];
//		}
//		System.out.println("min : " + min);
		
//		Sort(정렬)
//		1. 기본
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++)
			num[i] = (int)(Math.random() * 99) + 1;
		System.out.println("기본 보기 : " + Arrays.toString(num));
		
//		2. 오름차순
		for (int i = 0; i < num.length - 1; i++)
			for (int j = i + 1; j < num.length; j++)
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp; }
		System.out.println("크기 오름차순으로 정렬하여 보기 : " + Arrays.toString(num));
		
//		3. 내림차순
		for (int i = 0; i < num.length - 1; i++)
			for (int j = i + 1; j < num.length; j++)
				if (num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp; }
		System.out.println("크기 내림차순으로 정렬하여 보기 : " + Arrays.toString(num));
		
	}

}

