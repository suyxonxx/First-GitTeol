import java.util.*;

public class Wl220415_07 {

	public static void main(String[] args) {

//		if문을 사용하여 다섯 개 정수를 입력 받아서 가장 큰 수를 출력하는 프로그램 작성
//		입력받는 숫자는 0에서 100 사이로 강제할 것.
//		Made by me
		System.out.println("최대값 대신 구해드립니다. (입력 횟수 : 5회)\n※주의※ 0보다 크고 100보다 작은 정수를 입력해주세요!");
		Scanner sc = new Scanner(System.in);
		String tmp;
		int num, max = 0;
		
		for(int i = 1; i <=5; i++) {
			System.out.printf("▼ %d번째 입력\n", i);
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num > 0 && num < 100) {
				if (max < num) max = num;
			}
			else {
				System.out.println("다시 입력해주세요. (해당 횟수는 반환됩니다)");
				i--;
			}
		} //end of for
		System.out.println("최대값 : " + max);
		
		sc.close();
		
	}//end of main
}

