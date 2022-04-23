import java.util.Scanner;

public class Wl220408_02 {

	public static void main(String[] args) {
		
		int user, com;
//		앞으로 user - com을 치는 것 자체가 귀찮으면, 따로 변수 설정을 해줘도 상관 없음ㅇㅇ
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		
		System.out.println(Math.random());
		com = (int)(Math.random() * 3) + 1;
		
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");
		
		if((user - com) == 2 || (user - com) == -1)
			System.out.println("당신이 졌습니다.");

		else if((user - com) == 1 || (user - com) == -2)
			System.out.println("당신이 이겼습니다.");
//		-1-
//		else
//			System.out.println("비겼습니다.");
//		-2-
		else if((user - com) == 0)
			System.out.println("비겼습니다.");
		
		scanner.close();
		
	} //main의 끝

}

