import java.util.Scanner;

public class Wr220411_01 {

	public static void main(String[] args) {
//		Made by me
//		-1-
//		int sum = 0;
//		System.out.printf("★사칙연산 대신 해드립니다! (초기 결과값은 %d입니다.)★\n", sum);
//
//		q : for (int i = 1; i <=4; i++) {
//			for (; ;) {
//			System.out.println("어떤 종류의 연산을 하시겠습니까? (아래에 +, -, *, / 중 하나를 입력해주세요.)");
//			Scanner sc1 = new Scanner(System.in);
//			String ch = sc1.nextLine();
//			Scanner sc2 = new Scanner(System.in);
//			System.out.println("아래에 정수를 입력해주세요.");
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
//			
//			System.out.println("결과 : " + sum);
//			continue q;
//			}//for 끝
//		}//q 끝
		
//		-2-
		int sum = 0;
		System.out.printf("★사칙연산 대신 해드립니다! (초기 결과값은 %d입니다.)★\n", sum);

		for (; ;) {
			System.out.println("어떤 종류의 연산을 하시겠습니까? (아래에 +, -, *, / 중 하나를 입력해주세요.)");
			Scanner sc1 = new Scanner(System.in);
			String ch = sc1.nextLine();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("아래에 정수를 입력해주세요.");
			int num = sc2.nextInt();

			if (ch.equals ("+"))
				sum += num;
			else if (ch.equals ("-"))
				sum -= num;
			else if (ch.equals ("*"))
				sum *= num;
			else if (ch.equals ("/"))
				sum /= num;
			else {
				num = sum;
				System.out.println("잘못된 입력입니다. 다시 입력해주세요. (이전의 결과값은 저장되며, 아래와 같습니다.)");
			}
			System.out.println("결과 : " + sum);
			continue;
		}//for 끝
		
//		Made by others
//		int sum=0;
//        Scanner sc = new Scanner(System.in);
//        
//        while(true){
//           System.out.println("숫자입력(종료:0) : ");
//           String tmp = sc.nextLine();
//           int num = Integer.parseInt(tmp);
//           if (num == 0) break;
//
//           System.out.println("사칙연산 기호  : ");
//           String str = sc.nextLine();
//           char ch = str.charAt(0);
//           
//           switch(ch) {
//           case '+' :
//              sum +=num;
//              break;
//           case '*' :
//              sum *=num;
//              break;
//           case '/' :
//              sum /=num;
//              break;
//           case '-' :
//              sum -=num;
//              break;
//           default :
//              System.out.println("+ * - / 중 하나를 입력하세요");
//           }
//        }
//        System.out.println(sum);
        
	}//main 끝
}

