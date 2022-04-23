
public class Wl220415_10 {

	public static void main(String[] args) {
		
//		n번째 행에 n개씩 & 오른쪽 정렬로 별 채우기
//		1. for문 이용
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if (i + j > 5) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}//end of for
		
//		2. while문 이용
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (i + j  > 5) System.out.print("*");
				else System.out.print(" ");
			j++;}
			System.out.println();
		i++;}//end of while
		
//		3. do while문 이용
		int ii = 1;
		do {int jj = 1;
			do {if (ii + jj > 5) System.out.print("*");
				else System.out.print(" ");
			jj++;} while (jj <= 5);
			System.out.println();
		ii++;} while (ii <= 5);
		
	}//end of main

}

