import java.util.*;

public class Wr220413_01 {

	public static void main(String[] args) {
//		Sort(정렬) - while문 이용
//		1. 기본
		int[] num = new int [5];
		int i, j, tmp;
		i = 0;
		while (i < num.length) {
			num[i] = (int)(Math.random() * 99) + 1;
			i++; }
		System.out.println("기본 보기 : " + Arrays.toString(num));
		
//		2. 오름차순
		i = 0;
		while (i < num.length - 1) {
			j = i + 1;
			while (j < num.length) {
				if (num[i] > num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp; }
				j++; }
			i++; }//end of while
		System.out.println("크기 오름차순으로 정렬하여 보기 : " + Arrays.toString(num));
		
//		3. 내림차순
		i = 0;
		while (i < num.length - 1) {
			j = i + 1;
			while (j < num.length) {
				if (num[i] < num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp; }
				j++; }
			i++; }//end of while
		System.out.println("크기 내림차순으로 정렬하여 보기 : " + Arrays.toString(num));
	}//end of main

}

