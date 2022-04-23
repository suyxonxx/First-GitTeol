import java.util.Scanner;

public class Wl220406_06 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("아래에 당신의 점수를 입력해주세요.\n");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		System.out.printf("%d점이시군요!%n", score);
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94)
				opt = '-';
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84)
				opt = '-';
		} else {
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c 입니다.%n", grade, opt);
		
		sc.close(); //그동안 Scanner를 쓰고 나면 항상 !가 떴던 이유가 얘를 안써줘서, Scanner를 닫지 않았기 때문임.
//					  EI의 역할은, 자원을 다 사용한 후, 컴퓨터에게 반환하는 것.

	}

}

