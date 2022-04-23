import java.util.Scanner;

public class Wl220406_04 {

	public static void main(String[] args) {
		
		System.out.println("아래에 점수를 입력해주시면 당신의 학점을 알려드립니다.");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if (score >= 90 && score<=100)
			System.out.println("A");
		
		else if (score < 90 && score >= 80)
			System.out.println("B");
		
		else if (score < 80 && score >= 70)
			System.out.println("C");
		
		else if (score < 70 && score >= 60)
			System.out.println("D");
		
		else if (score < 60 && score >= 0)
			System.out.println("F");
		
		else
			System.out.println("입력하신 점수를 다시 확인해주세요.");
		
//		if (score >= 90)
//			System.out.println("A");
//
//		if (score >= 80)		
//			System.out.println("B");
//
//		if (score >= 70)		
//			System.out.println("C");
//
//		if (score >= 60)		
//			System.out.println("D");
//		
//		else
//			System.out.println("F");
		
//		참고 ) 90 <= num <= 100 이런거 안됨. (파이썬에서는 됨.)
		
		sc.close();
		
	}

}

