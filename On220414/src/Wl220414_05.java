
public class Wl220414_05 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		int x = 70;
		
		char result = x >= 90 ? 'A' : (x >= 80? 'B' : x >= 70 ? 'C' : 'F');
//		위처럼, 삼항연산자는 계속해서 중첩 가능.
		System.out.println(result);
		
		System.out.println("\n-2-");
		int i = 10;
		System.out.println(i <<= 3);

		System.out.println("\n-3-");
		int score = 63;
		char grade = ' ';
		char opt = '0';
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		if(score % 10 >= 8)
			opt = '+';
		else if(score % 10 < 4)
			opt = '-';
		
		if(grade == 'F')
			opt = ' ';
		
		System.out.printf("%c%c\n", grade, opt);
	}

}

