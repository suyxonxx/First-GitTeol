
public class Wl220408_04 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		
		for(int i1=1; i1<=10; i1++) {
			sum1 += i1;
			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i1, sum1);
		}
		
		
		int sum2 = 0;
		int i2 = 0;
		for(; i2 <= 9; ) {
			i2++;
			sum2 += i2;
			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i2, sum2);
		}
		
	}//main end

}

