import java.util.*;

public class Wl220421_09 {

	public static void main(String[] args) {
		
//		int[] nArr = new int[10]; ==>난수(0 ~ 9)로 배열 입력
//		단, 붙어있는 요소끼리 중복되면 안됨.

		Random rand = new Random(7);//괄호 안에 숫자를 집어넣으면, 특정 배열만 계속 나오게 됨.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 갯수 입력 : ");
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		nArr[0] = rand.nextInt(10);//갯수 : 10
		
		for(int i = 1; i < nArr.length; i++) {
			do {
				nArr[i] = rand.nextInt(10);//범위 : 0 ~ 9
			} while(nArr[i] == nArr[i - 1]);
		}
		System.out.println(Arrays.toString(nArr));
			
		sc.close();
	}//end of main

}//end of class
