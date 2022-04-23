import java.util.*;

public class Wl220422_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] monthString = {
									"January", "February", "March", "April", "May", 
									"June", "July", "Agust", "September", "October",
									"November", "December"
								};
		System.out.println("해당 월을 뜻하는 영어 단어를 맞춰보세요!");
		System.out.println("※첫 글자는 대문자, 그 이후는 소문자로 입력※");
		
		int retry = 0;
		int last = -1;//이전 월
		
		do {
//			Made by others
			int month;
//			직전 달과 같은 달이면 반복, 같은 달이 아니면 do while울 벗어남
			do {
				month = (int)(Math.random() * 12);
			} while(month == last);
			
			while (true) {
				System.out.println("▼ " + (month + 1) + "월");
				String qus = sc.nextLine();
				
				if (qus.equals(monthString[month])) break;
				System.out.println("오답입니다.");
			}
			
			last = month;
			
			System.out.println("정답입니다!" + System.lineSeparator()
							 + "▼ 재도전을 원하시면 1을, 아니면 다른 숫자를 아무거나 눌러주세요.");
			retry = sc.nextInt();
			sc.nextLine();//위의 nextInt에서 받은 줄바꿈문자열을 소거하는 역할.
			
		} while (retry == 1);
		System.out.println("안녕히가세요 *^^*");
		
		sc.close();
	}//end of main

}//end of class
