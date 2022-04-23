import java.util.Scanner;

public class Wl220406_08 {

	public static void main(String[] args) {
		
		System.out.print("아래에 현재 월을 입력하세요\n");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		System.out.println(Math.random());
		
//		if (month <= 2 && month == 12)
//			System.out.println("현재의 계절은 겨울입니다.");
//		if (month <= 2 && month == 12)
		
		switch (month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("현재의 계절은 봄입니다.");
			break;
		
		case 6 : case 7 : case 8 :
			System.out.println("현재의 계절은 여름입니다.");
			break;
			
		case 9 : case 10 : case 11 :
			System.out.println("현재의 계절은 가울입니다.");
			break;
			
		default :
//		case 12 : case 1 : case 2 : //←default를 사용하지 않고, 케이스들만 사용하고 마무리해도 됨.
			System.out.println("현재의 계절은 겨울입니다.");
//			if문의 경우엔 범위 설정이 가능하지만, switch문의 경우엔 값이 딱 떨어져야됨.
			
		}
		
		sc.close();
		
	}

}

