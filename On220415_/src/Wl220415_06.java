import java.util.*;

public class Wl220415_06 {

	public static void main(String[] args) {

//		if문을 사용하여 다섯 개 정수를 입력 받아서 가장 큰 수를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		int num, max = 0;
		String tmp;
		
		System.out.println("아래에 정수를 다섯번 입력하시오.");
		for(int i = 0; i < 5; i++) {
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(max < num)
				max = num;
		}//end of for
		System.out.println("최대값 : " + max);
		
		sc.close();
		
	}//end of main

}

