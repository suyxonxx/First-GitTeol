import java.util.*;

public class Wl220422_10 {

	public static void main(String[] args) {
//		암산 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("★암산하고가셔유★");
		
		int retry = 0;
		
		do {
			int x = (int)(Math.random() * 100 + 1);
			int y = (int)(Math.random() * 100 + 1);
			int z = (int)(Math.random() * 100 + 1);
			
			int num = (int)(Math.random() * 4);
			
			int answer = 0;
			
			switch(num) {
			case 0 : answer = x + y + z; break;
			case 1 : answer = x + y - z; break;
			case 2 : answer = x - y + z; break;
			default : answer = x - y - z; break;
			}
			
			while(true) {
				System.out.print(	x + ((num < 2) ? " + " : " - ") +
									y + ((num % 2 == 0) ? " + " : " - ") +
									z + " = ");
				
				int an = sc.nextInt();
				if (an == answer) break;
				System.out.println("오답입니다.");
			}
			System.out.println("정답입니다.");
			
			System.out.print("계속하시려면 1을, 종료를 원하시면 1을 제외한 다른 숫자를 아무거나 입력해주세요! >> ");
			retry = sc.nextInt();
			
		} while (retry == 1);
		System.out.println("프로그램 종료");
		
		sc.close();
	}//end of main

}//end of class
