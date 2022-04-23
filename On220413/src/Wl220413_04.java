import java.util.Scanner;

public class Wl220413_04 {
//	두 정수를 입력받아서 평균을 구하는 프로그램
	public static void main(String[] args) {
		
		double print = add();
		System.out.println("두 수의 평균 : " + print);
		System.out.println("프로그램 종료");
		
	}
//	입력 X, 출력 O
	public static double add() {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
//		Made by me
//		double avg = (double)(n1 + n2) / 2;
////		위에서 double의 저장 가능 범위가 int보다 크단 이유만으로 (double)을 생략할 생각이라면 접으셈.
////		이유는 다시 해보면 바로 생각날거임. 일단 안알랴줌.
//		
//		sc.close();
//		
//		return avg;
		
//		Made by others
		sc.close();
		
		return (n1 + n2) / 2.0; //정수형을 실수형으로 변환하는 아주 굉장히 몹시 간단한 방법.
	}
}

