import java.util.Scanner;

public class Wr220411_03 {

	public static void main(String[] args) {
//		-1-
//		System.out.println("합계를 구할 숫자를 입력하시오. (끝내려면 0을 입력)");
//		int sum = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while (true) {
//			String tmp = sc.nextLine();
//			int num = Integer.parseInt(tmp);
//			System.out.println(">>" + num);
//			if (num != 0)
//				sum += num;
//			else
//				break;`
//		} System.out.println("합계 : " + sum);

//		-2-
		System.out.println("합계를 구할 숫자를 입력하시오. (끝내려면 0을 입력)");
		int sum = 0;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (flag == true) {
			int num = sc.nextInt();
			System.out.println(">>" + num);
			if (num != 0)
				sum += num;
			else
				flag = false;
		} System.out.println("합계 : " + sum);
		
		sc.close();
		
	}//end of main

}

