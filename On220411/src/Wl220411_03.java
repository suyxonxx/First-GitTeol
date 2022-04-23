public class Wl220411_03 {

	public static void main(String[] args) {
		
//		1. for - do while
//		for (int i = 1; i <=100; i++) {
//			int tmp = i;
//			System.out.printf("%3d ", i);
//			
//			do {
//				if (tmp%10 % 3==0 && tmp%10 != 0)
//					System.out.print("짝");
//			}	while ((tmp/=10) != 0);
//			System.out.println();
//		}
		
//		2. while - do while
//		int i = 1;
//		
//		while (i <= 100) {
//		int tmp = i;
//		System.out.printf("%3d ", i);
//			do {
//				if (tmp%10 % 3==0 && tmp%10 != 0)
//					System.out.print("짝");
//			}	while ((tmp/=10) != 0);
//			System.out.println();
//			i++;
//		}
		
//		3. while - while
		int i = 1;
		while (i <= 100) {
			System.out.printf("i = %d\n", i);
			int tmp = i;
			while (true) {

				System.out.println("A - " + tmp%10);
				System.out.println("B - " + (tmp%10 % 3));
				
				if (tmp%10 % 3==0 && tmp%10 != 0)
					System.out.println("짝");
				
				if ((tmp/=10) == 0)
					break;
			}
			System.out.println("");
			i++;
		}
		
		
//		4. for
//		for (int i = 1; i <=100; i++) {
//			System.out.printf("i = %d\n", i);
//			int tmp = i;
//			for (;;) {
//				
//				System.out.println("A - " + tmp%10);
//				System.out.println("B - " + (tmp%10 % 3));
//				
//				if (tmp%10 % 3==0 && tmp%10 != 0)
//					System.out.println("짝");
//				
//				if ((tmp/=10) == 0)
//					break;
//			}
//			System.out.println("");
//		}
		
	}//end of main

}

