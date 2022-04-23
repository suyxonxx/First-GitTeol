import java.util.Scanner;

public class Wl220411_02 {

	public static void main(String[] args) {
		
//		숫자를 입력하면 합계가 출력되도록
		int num = 0;
		int sum = 0;
//		int i = 1;
		boolean flag = true;
		System.out.println("대신 덧셈해드립니다 (종료를 원하시면 0을 입력해주세요)☆★☆▶");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
//		Made by me
//		1. while_01_무제한
		while(flag) {
			if(num != 0)
				sum +=num;
			else
				flag = false;
			
				System.out.printf("계 : %d%n", sum);
				num = sc.nextInt();
			}

//		2. while_02_무제한
//		while(num != 0) {
//			if (num != 0)
//				sum +=num;
//			else
//				break;
//			
//				System.out.printf("계 : %d%n", sum);
//				num = sc.nextInt();
//			}
		
//		3. while_03_5회제한
//		while(i++ <= 5) {
//			if (num != 0)
//				sum += num;
//			else
//				break;
//			System.out.printf("계 : %d%n", sum);
//			if ((6 - i) != 0)
//				System.out.println((6 - i) + "회 남았습니다.");
//			else if ((6 - i) == 0)
//				System.out.println("덧셈 서비스 이용 가능 횟수를 초과하였습니다.");
//			num = sc.nextInt();
//		}
		
//		4. for_
//		for (; num !=0 ; num++) {
//			
//		}
//		
		
//		Made by others
//		이 코드는 덧셈 횟수를 최대 5회로 제한함.
//		int summ = 0; //누적용
//		int ii = 0; //회전용도
//		int input;
//		
//		while(ii++<5) {
//			System.out.println(ii + "회 정수 입력 : ");
//			input = sc.nextInt();
//			
//			summ += input;
//			System.out.println("sum : " + summ);
//		}
		
		sc.close();
		
	}//end of main

}

