import java.util.Scanner;

public class Wl220408_03 {

	public static void main(String[] args) {
		
		System.out.print("당신의 주민등록번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		char gender = regNo.charAt(7);
		
		switch (gender) {
		case '1': case '3':
				System.out.println("남자");
			switch (gender) {
			case '1':
					System.out.println("1999년 이전 출생");
					break;
			case '3':
					System.out.println("2000년 이후 출생");
			}
			break;

		case '2': case '4':
				System.out.println("여자");
			switch (gender) {
			case '2':
					System.out.println("1999년 이전 출생");
					break;
			case '4':
					System.out.println("2000년 이후 출생");
			}
			break;
			
		default:
			System.out.println("유효하지 않음");
		} //switch end
		
		sc.close();
		
	} //main end

}

