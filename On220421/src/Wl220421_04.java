import java.util.Scanner;

public class Wl220421_04 {
	
	static int num1, num2, num3; //공용 변수 (= 정적 변수 = 클래스 변수)
	
//		세 정수를 입력받아서 최대값 출력 (배열 사용 금지)
//		Input 함수, Calc 함수, Output 함수 사용
//		Made by others
	public static void main(String[] args) {
		Input();
		int max = Calc();
		Output(max);
	}//end of main
	
	static void Input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sc.close();
	}//end of Input
	
	static int Calc () {
		int max = num1;
		
		if(num2 > max) {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}
		else if (num3 > max)
			max = num3;
		
		return max;
	}//end of Calc
	
	static void Output (int num) {
		System.out.println("max : " + num);
	}//end of Output

}//end of class
