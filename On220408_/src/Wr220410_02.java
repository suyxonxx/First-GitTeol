
public class Wr220410_02 {

	public static void main(String[] args) {

		System.out.println("-1-");
		for (int i1 = 1; i1 <= 9; i1++) {
			for (int j1 = 2; j1 <= 9; j1++)
				System.out.printf("%d × %d = %d\t", j1, i1, i1 * j1);
			System.out.println("");
		}
		
		System.out.println("-2-");
		int i2 = 0;
		int sum = 0;
		for (; i2 < 10; ) {
			++i2;
			sum += i2;
			System.out.println("1 부터 "+ i2 + " 까지의 합 = " + sum);
		}

		System.out.println("-3-");
		int i3 = 1;
		int sign = 1;
		int summ = 0;
		for (; true; i3++, sign = -sign) {
			summ += i3;
			if (summ < 100) {
				System.out.printf("i가 %d일 때 sum : %d%n");
			}
			
		}
		
	} //main end

}

