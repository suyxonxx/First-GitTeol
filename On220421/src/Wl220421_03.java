import java.util.Scanner;

public class Wl220421_03 {
	
	static int num1, num2, num3; //공용 변수 (= 정적 변수 = 클래스 변수)
	
//		세 정수를 입력받아서 최대값 출력 (배열 사용 금지)
//		Input 함수, Calc 함수, Output 함수 사용
//		Made by me
	public static void main(String[] args) {
		Input();
	}//end of main
	
	static void Input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		Calc(num1, num2, num3);
		
		sc.close();
	}//end of Input
	
	static void Calc (int num1, int num2, int num3) {
		int max = num1;
		
		if(num2 > max) {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}
		else if (num3 > max)
			max = num3;
		
		Output(max);
	}//end of Calc
	
	static void Output (int max) {
		System.out.println("max : " + max);
	}//end of Output

}//end of class
