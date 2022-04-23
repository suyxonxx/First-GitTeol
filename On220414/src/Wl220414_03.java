import java.util.Scanner;

public class Wl220414_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 : ");
		String str = sc.nextLine();
		System.out.println(str);
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
//		위에서 , 9-11과 13-15가 바뀌면 정수만 입력받고 끝나버림.
		
		sc.close();
		
	}

}

