import java.util.*;

public class Wl220421_05 {

	public static void main(String[] args) {
		
//		2자리 정수를 입력하기 전까지 무한반복 (숫자만 입력 받음.)
		{//1. Made by me
			System.out.println("▼ 두 자리의 정수를 입력하세요");
			
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				int user = sc.nextInt();
				
				if (user >= 10 && user <= 99) {
					System.out.println("당신이 입력한 숫자는 " + user + " 입니다.");
					break;
				}
				else {
					System.out.println("입력 가능한 숫자의 범위를 다시 확인해주시고 재입력해주세요!");
					continue;
				}
				
			}//end of while
			sc.close();
		}//end of block 1
		
		{//2. Made by others
			
//			sc.close();
		}//end of block 2
		
	}//end of main

}//end of class
