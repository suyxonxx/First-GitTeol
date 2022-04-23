
public class Wl220408_06 {

	public static void main(String[] args) {

//		1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
		
		System.out.println("-1-");
//		Made by others
		int sum = 0;
		int i = 0;
		int sign = 1;
		int tmp = 0;
		
		for (i=1; true; i++, sign = -sign) { //sign : 1, -1, 1, -1 ...
			tmp = i * sign;
			
			System.out.println(tmp);
			sum +=tmp;
			
			if(sum>=100)
				break;
		}
		System.out.println("i : " + i + ", sum : " + sum);
		
		System.out.println("\n-2-");
//		Made by me
		int ss = 0;
		int ii = 0;
		for ( ; true ; ii++) {
			
			if (ss < 100) {
				if (ii % 2 != 0)
					ss += ii;
				else if (ii % 2 == 0)
					ss -= ii;
				}
			
			else
				break;
		}
		System.out.println("ii : " + (ii - 1) + ", ss : " + ss);

		System.out.println("\n-3-");
		for (int v = 0; v < 6; ++v) {
			 System.out.println((int)(Math.random()*45 + 1));
		}
			 
	} //main end

}

