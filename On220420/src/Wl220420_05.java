import java.util.Scanner;

public class Wl220420_05 {//Made by others

	public static void main(String[] args) {//메인에서는 호출만!
		System.out.println("★시외버스 요금 알려드립니다★");
		
		int age = input();
		int fee = 2500;
		double discountRate = feeCalcRate(age);
		output(age, fee, discountRate);
	}//end of main
	
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("▼ 나이를 입력해주세요");
		int userInput = sc.nextInt();
		
		sc.close();
		
		return userInput;
	}//end of input
	
	static double feeCalcRate(int age) {
		double discountRate = 1.0;
		
		if (age >= 4 && age <= 13) {
			discountRate = 0.5;
		}
		else if (age >= 14 && age <= 19) {
			discountRate = 0.25;
		}
		else if (age >= 20 && age <= 64) {
			discountRate = 0.0;
		}
		
		return discountRate;
	}//end of feeCalcRate
	
	static void output(int age, int fee, double discountRate) {
		System.out.printf("%d세이시군요! 당신이 내야 하는 요금은 %d원 입니다.",
							age, (int)(fee * (1 - discountRate)));
	}//end of output

}//end of class
