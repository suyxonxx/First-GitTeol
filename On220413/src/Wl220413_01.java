import java.util.Scanner;

public class Wl220413_01 {

	public static void main(String[] args) {//JVM(Java Virtual Machine) 호출
		
		add(); //함수 호출
		
	}
//	입력 X, 출력 X / void : 반환형, add : 함수 이름
	public static void add() {// 함수 정의, 함수 몸체
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("프로그램 종료");

		sc.close();
	}
}

