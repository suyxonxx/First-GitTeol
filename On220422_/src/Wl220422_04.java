import java.util.*;

public class Wl220422_04 {

	public static void main(String[] args) {
		
//		일 월 화 수 목 금 토 일 --> 이 중 하나가 나오면 
//		그에 맞는 소문자로 요일 입력 --> sunday, monday, tuesday, wednesday, thursday, friday, saturday
//		Made by me
		Scanner sc = new Scanner(System.in);
		
		String[] dayEng = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		String[] dayKor = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("★해당 요일을 뜻하는 영단어 맞추기★");
		System.out.println("※영문 소문자로만 입력하셔야 정답으로 간주합니다※");
		
		int retry = 0;
		int last = -1;
		
		do {
			int index;
			do {
				index = (int)(Math.random() * 7);
			} while (last == index);
			
			do {
				System.out.println("▼ " + dayKor[index] + "요일");
				String user = sc.nextLine();
				if (user.equals(dayEng[index])) {
					System.out.println("정답입니다!");
					break;
				}
				else System.out.println("오답입니다.. 다시!");
			} while (true);
			
			last = index;
			
			System.out.println("계속 도전하고 싶으시면 1을, 아니라면 다른 숫자를 아무거나 입력하여 종료해주세요.");
			retry = sc.nextInt();
			sc.nextLine();
		} while (retry == 1);
		
		System.out.println("안녕히가세요 *^^*");
		
		sc.close();
	}//end of main

}//end of class
