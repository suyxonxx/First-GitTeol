
public class Wl220419_09 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		{//1. 그냥 for문
			int[] arr = {10, 20, 30, 40, 50};
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println("총점 = " + sum);
		}//end of block 1
		
		{//2. 향상된 for문
			int[] arr = {10, 20, 30, 40, 50};
			int sum = 0;
			for(int i: arr) {
				sum += i;
			}
			System.out.println("총점 = " + sum);
		}// end of block 2
		
		System.out.println(System.lineSeparator() + "-2-");
		{//3. 다중배열 - 그냥 for문
			int[][] arr = {
					{5, 5, 5, 5, 5},
					{10, 10, 10, 10, 10},
					{20, 20, 20, 20, 20, 20, 20},
					{30, 30, 30, 30, 30, 30}
			};
			
			int total = 0;
			float average = 0f;
			
			int count = 0;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					total += arr[i][j];
					count++;
				}
			}
			
			System.out.println("count = " + count);
			average = (float)total / count;
			
			System.out.println("total = " + total);
			System.out.println("average = " + average);
			System.out.printf("average = %.1f%n", average);
		}//end of block 3
		
		{//4. 다중배열 - 향상된 for문
			int[][] arr = {
					{5, 5, 5, 5, 5},
					{10, 10, 10, 10, 10},
					{20, 20, 20, 20, 20},
					{30, 30, 30, 30, 30}
			};
			
			int total = 0;
			float average = 0f;
			
			int count = 0;
			for(int[] i : arr) {
				for (int j : i) {
					total += j;
					count++;
				}
			}
			
			average = (float)total / count;
			
			System.out.println("total = " + total);
			System.out.println("average = " + average);
		}//end of block 4
		
	}//end of main
	
}//end of class
