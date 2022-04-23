import java.util.*;

public class Calandar {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("☆★달력 보고가세요★☆");
		Thread.sleep(500);
		
		Scanner sc = new Scanner(System.in);
		int year = 0, month = 0, week = 0, day = 0, i = 0;
		int[] days_per_month = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Exit : {
			User : while (true) {
				System.out.println("▼ 연도를 입력해주세요! (종료를 원하시면 0을 입력해주세요.)");
				year = sc.nextInt();
				if (year < 0) {
					System.out.println("아쉽게도 기원전 달력 보기는 지원하지 않아요. 다시...");
					Thread.sleep(500);
					continue;
				}
				else if (year == 0) {
					System.out.println("프로그램을 종료합니다. 안녕히 가세요!");
					break Exit;
				}
				
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					days_per_month[1] = 29;
				}
				
				while (true) {
					System.out.println("▼ 월을 입력해주세요!");
					month = sc.nextInt();
					if(month < 1 || month > 12) {
						System.out.println("1 이상 12 이하의 정수만 받아요. 다시...");
						Thread.sleep(500);
						continue;
					}
					else break User;
				}
				
			}//end of User
			
			sc.close();
			
			day = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
			
			for (i = 0; i < month - 1; i++) {
				day += days_per_month[i];
			}
			week = (day + 1) % 7;
			
			System.out.printf("<%d년 %d월>%n", year, month);
			System.out.println("일\t월\t화\t수\t목\t금\t토"
			+ System.lineSeparator() + "---------------------------------------------------");
			
			for (i = 0; i < week; i++) {
				System.out.print("\t");
			}
			for(i = 1; i <= days_per_month[month - 1]; i++) {
				System.out.printf("%2d\t", i);
				week++;
				if(week % 7 == 0)
					System.out.println("");
			}
			
		}//end of Exit
		
	}//end of main
	
}
