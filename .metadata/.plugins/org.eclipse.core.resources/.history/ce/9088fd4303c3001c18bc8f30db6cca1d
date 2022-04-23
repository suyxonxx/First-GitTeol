import java.util.*;

public class Wl220422_05 {

	public static void main(String[] args) {
		
//		일 월 화 수 목 금 토 일 --> 이 중 하나가 나오면 
//		그에 맞는 소문자로 요일 입력 --> sunday, monday, tuesday, wednesday, thursday, friday, saturday
//		Made by others
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		String[] dayEng = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		String[] dayKor = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("★해당 요일을 뜻하는 영단어 맞추기★");
		System.out.println("※영문 소문자로만 입력하셔야 정답으로 간주합니다※");
		
		int retry = 0;
		int last = -1;
		
		do {
			int day;
			do {
				day = rand.nextInt(7);
			} while (day == last);
			
			last = day;
			
			while (true) {
				System.out.println("▼ " + dayKor[day] + "요일");
				String dayeng = sc.nextLine();
				
				if(dayeng.equals(dayEng[day])) break;
				
				System.out.println("오답입니다.. 다시!");
			}
			System.out.println("정답입니다!" + System.lineSeparator()
							 + "계속 도전하고 싶으시면 1을, 아니라면 다른 숫자를 아무거나 입력하여 종료해주세요.");
			retry = sc.nextInt();
			sc.nextLine();
		} while (retry == 1);
		
		System.out.println("안녕히가세요 *^^*");
		
		sc.close();
	}//end of main

}//end of class
