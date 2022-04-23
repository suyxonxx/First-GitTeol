import java.util.Scanner;

public class Wl220406_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
//		if (str.equals("yes")) //←대소문자 구분함.
//			System.out.println("정답입니다!");
		
		if (str.equalsIgnoreCase("yes")) //←대소문자 구분하지 않음.
			System.out.println("정답입니다!"); //←if문에 속한 문장임.
			System.out.println("빠밤"); //←if문에 속한 문장이 아님.
			
			sc.close();
		
	}

}

