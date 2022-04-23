public class Wl220411_04 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		int sum1 = 0;
		int i1 = 1;
		for (; i1 <= 100; i1++) {
			
			if (sum1 > 100)
				break;
			sum1 += i1;
		}
		
		System.out.printf("자연수를 %d회 누적했을 때의 합계 = %d%n", i1-1, sum1);
		
		
		System.out.println("\n-2-");
		int sum2 = 0;
		int i2 = 1;
		for (; i2 <= 100; i2++) {
			if (i2 % 2 == 1)
				continue;
			
			sum2 += i2;
		}
		System.out.printf("짝수를 %d회 누적했을 때의 합계 = %d%n", i2-1, sum2);
		
		
		System.out.println("\n-3-");
		int sum3 = 0;
		int i3 = 0;
		
		while (true) {
			if (sum3 > 100)
				break;
			
			++i3;
			sum3 += i3;
		}//end of while
		
		System.out.println("i = " + i3);
		System.out.println("sum = " + sum3);

		
		System.out.println("\n-4-");
		int i4 = 2;
		int j4 = 1;
		
		for (; i4 <= 9; i4++) {
			for (; j4<=9; j4++)
				System.out.println(i4 * j4);
			
			if (i4 == j4)
				break;
		}
		System.out.println("final");
		
		
		System.out.println("\n-5-");
		for (int i5 = 0; i5 <= 10; i5++) {
			if (i5%3 == 0)
				continue;
			System.out.println(i5);
		}
		
	}//end of main

}

