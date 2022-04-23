import java.util.Scanner;

public class Wl220420_01 {

	public static void main(String[] args) {
		{	System.out.println("-1-");
			int fee = 2500;
			double discountRate = 1.0;
			
			int age = (int)(Math.random() * 120);
			
			if (age >= 4 && age <= 13) {
				discountRate = 0.5;
			}
			else if (age >= 14 && age <= 19) {
				discountRate = 0.25;
			}
			else if (age >= 20 && age <= 64) {
				discountRate = 0.0;
			}
			
			System.out.printf("나이가 %d세일 때 내야 하는 요금은 %d원 입니다.%n"
							, age, (int)(fee * (1 - discountRate)));
		}//end of block 1
		
		{	System.out.println("\n-2-");

			System.out.println("★버스 요금 계산해드립니다★");
			Scanner sc = new Scanner(System.in);
			System.out.println("▼ 아래에 나이를 입력해주세요.");
			int age = sc.nextInt();
			
			int fee = 2500;
			double discountRate;
			
			switch (age) {
			case 4 : case 5 : case 6 : case 7 : case 8 : 
			case 9 : case 10 : case 11 : case 12 : case 13 : 
				discountRate = 0.5;
			case 14 : case 15 : case 16 : case 17 : case 18 : case 19 : 
				discountRate = 0.25;
			case 20 : case 21 : case 22 : case 23 : case 24 : 
			case 25 : case 26 : case 27 : case 28 : case 29 : 
			case 30 : case 31 : case 32 : case 33 : case 34 : 
			case 35 : case 36 : case 37 : case 38 : case 39 : 
			case 40 : case 41 : case 42 : case 43 : case 44 : 
			case 45 : case 46 : case 47 : case 48 : case 49 : 
			case 50 : case 51 : case 52 : case 53 : case 54 : 
			case 55 : case 56 : case 57 : case 58 : case 59 : 
			case 60 : case 61 : case 62 : case 63 : case 64 : 
				discountRate = 0.0;
			default :
				discountRate = 1.0;
			}

			System.out.printf("나이가 %d세일 때 내야 하는 요금은 %d원 입니다."
							, age, (int)(fee * (1 - discountRate)));
			
			sc.close();
		}//end of block 2
		
	}//end of main

}//end of class
