import java.util.Scanner;

public class Wl220411_01 {

	public static void main(String[] args) {
		System.out.println("-1-");
		int i = 5;
		
		while (i-- != 0) 
			System.out.printf("%d - I can do it!%n", i);
		
		System.out.println("\n-2-");
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
//		String tmp = sc.nextLine();
//		num = Integer.parseInt(tmp);
		
		while (num != 0) {
			sum += num % 10; //sum = sum + num % 10
			System.out.printf("sum = %3d\tnum = %d%n", sum, num); //'%t' doesn't exist!!!
			
			num /= 10; //num = num / 10
		}
		
		System.out.println("각 자리수의 합 : " + sum);
		
		sc.close();
		
	}

} //end of main

