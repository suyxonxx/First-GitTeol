
import java.util.Scanner;

public class Wl220415_03 {

	public static void main(String[] args) {
		
//		이건 그냥 심심해서 만들어본 스캐너version.
		
		System.out.println("★버스 요금 알려드립니다★\n▼ 나이를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age >= 0) {
			int print = sub(age);
			System.out.printf("당신이 내야하는 버스 요금은 %d원 입니다.\n",print);
		}
		else
			System.out.println("입력하신 정보를 다시 확인해주세요.");
		
		System.out.println("EXIT");
		sc.close();
		
	} //end of main
	
	public static int sub(int age) {
		
		int feeO = 1500;
		int feeA = 0;
		
		if (age >=4 && age <= 13) {
			feeA = (int)(feeO * 0.5);
		}
		else if (age >=14 && age <= 19) {
			feeA = (int)(feeO * 0.75);
		}
		else if (age >=20 && age < 65) {
			feeA = feeO;
		}
		
		return feeA;
		
	} //end of sub

}

