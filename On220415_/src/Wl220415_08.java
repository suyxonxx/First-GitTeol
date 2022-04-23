import java.util.Scanner;

public class Wl220415_08 {

	public static void main(String[] args) {

//		if문을 사용하여 다섯 개 정수를 입력 받아서 가장 큰 수를 출력하는 프로그램 작성
//		입력받는 숫자는 0에서 100 사이로 강제할 것.
//		Made by others
		System.out.println("최대값 대신 구해드립니다. (입력 횟수 : 5회)\n※주의※ 0보다 크고 100보다 작은 정수를 입력해주세요!");
		Scanner sc = new Scanner(System.in);
		String tmp;
		int i = 0, num, max = 0;
		
		System.out.println("정수 5회 입력 : ");
		
		while(i < 5) {
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num > 0 && num < 100) {
				if(max < num) max = num;
				i++;
			}
			else {
				System.out.println("0보다 크고 100보다 작은 정수만 입력하십시오.");
			}
		}//end of while
		
		System.out.println("최대값 : " + max);
		
		sc.close();
		
	}//end of main
}

