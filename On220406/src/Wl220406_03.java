import java.util.Scanner;

public class Wl220406_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num > 0) 
			System.out.println("양수");
		
//		----------------1----------------
//		if (num == 0) {
//			System.out.println("빵★");
//			System.out.println("☆야");
//		}
//		
//		if (num < 0)
//			System.out.println("음수");
		
//		----------------2----------------
//		else if (num == 0) {
//			System.out.println("빵★");
//			System.out.println("☆야");
//		}
//		
//		else
//			System.out.println("음수");
		
//		----------------3----------------
//		else
//			System.out.println("양수 아님");
		
//		----------------4----------------
//		중첩 if : if 안에 if가 또 들어가는 형태.
//		사용 가능하긴 하나, 가급적 쓰지 않는 것이 좋다고 함.
		else {
			if(num < 0)
				System.out.println("음수");
			else
				System.out.println("빠앙");
		}

		sc.close();
		
	}

}

