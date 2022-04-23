import java.util.Scanner;

public class Wl220421_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		세 정수를 입력받아서 최대값 출력 (배열 사용 금지)
		{//1. Made by me
			System.out.println("★최대값 알리미★");
			System.out.println("▼ 첫번째 숫자를 입력하세요");
			int n1 = sc.nextInt();
			System.out.println("▼ 두번째 숫자를 입력하세요");
			int n2 = sc.nextInt();
			System.out.println("▼ 세번째 숫자를 입력하세요");
			int n3 = sc.nextInt();
			
			int max;
			
			if (n1 < n2) {
				max = n2;
				if (n2 < n3)
					max = n3;
			}
			else {
				max = n1;
				if (n1 < n3)
					max = n3;
			}
			
			System.out.println("최대값 : " + max);
			
		}//end of block 1
		
		{//2. Made by others
			int num1, num2, num3, max;
			
			System.out.println("정수 3개 입력 : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();
			
			max = num1;
			
			if(num2 > max) {
				if (num2 > num3)
					max = num2;
				else
					max = num3;
			}
			else if (num3 > max)
				max = num3;
			
			System.out.println("max : " + max);
		}//end of block 2
		sc.close();
	}//end of main

}//end of class
