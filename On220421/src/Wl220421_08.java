import java.util.*;

public class Wl220421_08 {

	static int[][] mdays = {
						{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//평년
						{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}//윤년
					};
	
	static int isLeap (int year) {//평년, 윤년 계산
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}//end of isLeap
	
	static int dayOfYear (int year, int month, int day) {
		int days = day;
		for(int i = 1; i < month; i++)
			days += mdays[isLeap(year)][i - 1];
		
		return days;
	}//end of dayOfYear
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int re = 0;
		
		System.out.println("입력하신 년도의 경과 일수를 구해드립니다.");
		
		do {
			System.out.print("년도 입력 : ");
			int year = sc.nextInt();
			System.out.print("월 입력 : ");
			int month = sc.nextInt();
			System.out.print("일 입력 : ");
			int day = sc.nextInt();
			System.out.printf("%d년의 %d번째 날입니다.%n"
					, year, dayOfYear(year, month, day));
			
			System.out.println("반복을 원하시면 1을, 종료하시려면 다른 숫자를 입력해주세요");
			re = sc.nextInt();
			
			if(re != 1)
				System.out.println("EXIT");
		} while(re == 1);
		
		sc.close();
	}//end of main

}//end of class
