import java.util.Scanner;

public class Wr220416_02 {
	
	public static void main(String[] args) {
		
		System.out.println("각 자릿수의 합 구해드립니다");
		Scanner sc = new Scanner(System.in);
		System.out.println("▼ 숫자를 입력해주세요");
		String tmp = sc.nextLine();
		int num = Integer.parseInt(tmp);
		
		int sum = 0;
		
		while (num % 10 != 0) {
			sum += num % 10;
			System.out.printf("sum : %3d num : %d\n", sum, num);
			num /= 10;
		}
		System.out.println("각 자릿수의 합 : " + sum);
		
		sc.close();
		
	}//end of main

}

