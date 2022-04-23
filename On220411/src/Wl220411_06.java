import java.util.Scanner;

public class Wl220411_06 {

	public static void main(String[] args) {
//		횟수 무제한
		System.out.println("사칙연산");
		int sum = 0;
		System.out.printf("sum(%d)\n", sum);
		
		for (; ;) {
			Scanner sc1 = new Scanner(System.in);
			String str = sc1.nextLine();
			char ch = str.charAt(0);
			Scanner sc2 = new Scanner(System.in);
			int num = sc2.nextInt();
			
			if (ch == '+')
				sum += num;
			else if (ch == '-')
				sum -= num;
			else if (ch == '*')
				sum *= num;
			else if (ch == '/')
				sum /= num;
			else {
				num = sum;
				System.out.println("잘못된 입력입니다. 다시 입력해주세요. (이전의 결과값은 저장되며, 아래와 같습니다.)");
			}
			System.out.printf("sum(%d)\n" , sum);
			continue;
			}//for 끝
		
//		횟수를 4회로 제한
//		System.out.println("사칙연산");
//		int sum = 0;
//		System.out.printf("sum(%d)\n", sum);
//		
//		q : for (int i = 1; i <=4; i++) {
//		for (; ;) {
//			Scanner sc1 = new Scanner(System.in);
//			String ch = sc1.nextLine();
//			Scanner sc2 = new Scanner(System.in);
//			int num = sc2.nextInt();
//
//			if (ch.equals ("+"))
//				sum += num;
//			else if (ch.equals ("-"))
//				sum -= num;
//			else if (ch.equals ("*"))
//				sum *= num;
//			else if (ch.equals ("/"))
//				sum /= num;
//			else {
//				num = sum;
//				System.out.println("잘못된 입력입니다. 다시 입력해주세요. (이전의 결과값은 저장되며, 아래와 같습니다.)");
//			}
//			System.out.printf("sum(%d)\n" , sum);
//			continue q;
//			}//for 끝
//		}//q 끝
	}//end of main
}

