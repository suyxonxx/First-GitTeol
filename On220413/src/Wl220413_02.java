import java.util.Scanner;

public class Wl220413_02 {
//	두 정수를 입력받아서 합을 구하는 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		add(num1, num2);
		
		sc.close();
	}
//	입력 O, 출력 X
	public static void add(int n1, int n2) {
		
		System.out.println("두 수의 합 : " + (n1 + n2));
		System.out.println("프로그램 종료");
		
	}
}