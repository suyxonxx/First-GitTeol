import java.util.Scanner;

public class Wl220406_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
//		String tmp = sc.nextLine();
//		int num = Integer.parseInt(tmp);
		
		switch(num) {
		case 1 :
			System.out.println("1 입력");
		case 2 :
			System.out.println("2 입력");
		case 3 :
			System.out.println("3 입력");
		case 4 :
			System.out.println("4 입력");
			break;
		default :
			System.out.println("그 외 입력");
		}
//		break;를 아예 작성하지 않는 경우, 해당 케이스의 문장부터 default의 문장까지의 범위 내에서 전부 실행해버리며,
//		break;를 일부 케이스들의 종료 부분에만 작성하는 경우, 해당 케이스 ~ break; 이전의 모든 케이스 범위 내에서 전부 실행함.
//		따라서, break;가 작고 소중하게 생겼다고 깜빡해버리면 절대 안됨.
		
		sc.close();

	}

}

