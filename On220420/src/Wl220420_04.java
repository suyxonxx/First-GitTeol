import java.util.*;

public class Wl220420_04 {//Made by me

	public static void main(String[] args) {
		System.out.println("★시외버스 요금 알려드립니다★");
		
		int age = input();
		double discountRate = feeCalcRate(age);
		int fee = output(discountRate);
		
		System.out.printf("%d세이시군요! 당신이 내야 하는 요금은 %d원 입니다.", age, fee);
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
	
	static int output(double discountRate) {
		int fee = (int)(2500 * (1 - discountRate));
		
		return fee;
	}//end of output

}//end of class
