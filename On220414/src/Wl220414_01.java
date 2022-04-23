import java.util.Arrays;

public class Wl220414_01 {

	public static void main(String[] args) {
		
//		총합 및 평균
//		10 data, 1 ~ 100.
		
		int [] arr = new int [10];
		int sum = 0;
		
//		for(int i = 0; i < arr.length; i++)
//			arr[i] = (int)(Math.random() * 100) + 1;
//		
//		System.out.println(Arrays.toString(arr));
		
//		Made by me
//		for (int i = 0; i < arr.length; i++)
//			sum += arr[i];
//		
//		System.out.println("sum = " + sum);
//			
//		double avg = 0;
//		
//		for (int i = 0; i < arr.length; i++)
//			avg += (arr[i] / (double)arr.length);
//		
//		System.out.printf("avg = %.1f\n", avg);
		
//		Made by others
//		- 1 -
//		for (int i = 0; i < arr.length; i++)
//			sum += arr[i];
//		
//		System.out.println("sum = " + sum);
//		System.out.println("avg = " + (double)sum/arr.length);
		
//		-2-
//		아예 처음부터...  ∴ shortest
		for (int i = 0; i < arr.length; i++)  {
			arr[i] = (int)(Math.random() * 100) + 1;
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (double)sum/arr.length);
		
	}

}

