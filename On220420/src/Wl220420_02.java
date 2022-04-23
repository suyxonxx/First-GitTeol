import java.util.Arrays;

public class Wl220420_02 {

	public static void main(String[] args) {
		
		{//1 ~ 100까지 총합 & 평균 구하기
			int sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			double avg = sum / 100.0;
			System.out.printf("1부터 100까지 총합 = %d, 평균 = %.2f%n", sum, avg);
		}//end of block 1
		
		{//1 ~ 100 2의 배수이면서 7의 배수의 갯수 및 총합 출력
			int sum = 0, count = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0 && i % 7 == 0) {
					sum += i;
					count++;
				}
			}
			System.out.printf("1부터 100까지 2의 배수이면서 7의 배수의 갯수 = %d, 총합 = %d%n", count, sum);
		}//end of block 2
		
		{
			int count = 0;
			
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0 && i % 7 == 0) {
					count++;
				}
			}
			
			int[] multi = new int[count];
			int j = 0;
			
			for (int i = 1; i <= 100; i++) {
				if (i % 2 == 0 && i % 7 == 0) {
					multi[j++] = i;
				}
			}
			
			System.out.println(Arrays.toString(multi));
			
		}//end of block 3
		
	}//end of main

}//end of class
