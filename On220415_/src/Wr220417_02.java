import java.util.Scanner;

public class Wr220417_02 {
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 맞춰라!!" + System.lineSeparator() + "1과 100 사이의 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int com = (int)(Math.random() * 100 + 1);
		int user, i = 1;
		
		do {
			System.out.println("▼ " + i + "회 시도");
			String temp = scan.nextLine();
			user = Integer.parseInt(temp);
			if (user > com) {
				if (user > 100) {
					System.out.println("입력하신 숫자를 다시 확인해주세요 (해당 횟수는 반환됩니다)");
					i--;
				}
				else System.out.println("DOWN");
			}
			else if (user < com)
				System.out.println("UP");
			else {
				System.out.println("CORRECT !");
				if (i <= 10)
					System.out.println(i + "번 만에 맞추시다니... 행운의 여신은 당신의 편이군요!");
				else if (i > 30)
					System.out.println(i + "번을 묵묵히 시도하는 당신의 집념과 끈기를 높이 사겠습니다... 대단해요!");
				break;
			}
			i++;
		} while(true);
		
		scan.close();
		
	}//end of main

}

