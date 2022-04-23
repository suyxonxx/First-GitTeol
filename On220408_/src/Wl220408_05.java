
public class Wl220408_05 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		for(int i=2; i<=9; i++) {
			System.out.printf("<%d단>%n", i);
			for (int j=1; j<=9; j++)
				System.out.printf("%d × %d = %d%n", i, j, i * j);
			System.out.println("");
		}
		
		System.out.println("\n-2-");
		int i = 1;
		int s = 0; //변수선언!
		
		for (; i <= 20; i++) {
			if ((i % 2 != 0) && (i % 3 != 0)) {
				s += i;
				System.out.printf("1부터 %2d까지의 합계 = %2d%n", i, s);
			}
		}
		
		System.out.println("최종 합계 = " + s);

		
	} //main end

}

