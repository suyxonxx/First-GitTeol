import java.util.Scanner;

public class Wl220406_01 {

	public static void main(String[] args) {

//		Made by me
		System.out.println("-1-");
		int num = 4000;
		int mxs = 3600;
		int hour = num / mxs;
		int min = (num % mxs) / 60;
		int sec = ((num % mxs) % 60);

//		Made by others
//		int hour = num / 3600;
//		int minte = num % 3600 / 60;
//		int second = num % 60;
		
		System.out.println(num + "초는 "+ hour + "시간 " + min + "분 " + sec + "초와 같습니다.");
		System.out.println("");
		
		System.out.println("-2-");
//		키보드로 두 정수 입력을 받아서, 총점과 평균을 출력한다.
		System.out.println("당신의 성적을 입력하세요!");
//		Made by me
		Scanner sc = new Scanner(System.in);
//		
//		String score1 = sc.nextLine();
//		int jumsu1 = Integer.parseInt(score1);
//
//		String score2 = sc.nextLine();
//		int jumsu2 = Integer.parseInt(score2);
//		
//		System.out.println("총점 : " + (jumsu1 + jumsu2));
//		System.out.println("평균 : " + ((double)(jumsu1 + jumsu2)/2));

//		Made by others
//		------------1------------
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

//		------------2------------
//		String n1 = sc.nextLine();
//		String n2 = sc.nextLine();
//		
//		int num1 = Integer.parseInt(n1);
//		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2;
		double aver = sum / 2.0;
		
		System.out.println("함계 : " + sum + " 평균 :" + aver);

		System.out.println("\n성적이 당신을 닮아서 꽤나 자유분방하네요!");
		
		sc.close();
		
	}

}

