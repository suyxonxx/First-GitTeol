import java.util.Scanner;

public class Wl220406_09 {

	public static void main(String[] args) {
		
//		Wl220406_04와 비교하며 보셈.
		System.out.println("아래에 점수를 입력해주시면 당신의 학점을 알려드립니다.");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		switch (score / 10) { //←switch 뒤의 괄호 내부에 연산과정을 거치는 변수 또한 들어갈 수 있음!!
		
		case 9 :
			System.out.println("A");
		break;
		
		case 8 :
			System.out.println("B");
		break;
		
		case 7 :
			System.out.println("C");
		break;
		
		case 6 :
			System.out.println("D");
		break;
		
		default :
			System.out.println("F");
		
		}
		
		sc.close();
		
	}

}

