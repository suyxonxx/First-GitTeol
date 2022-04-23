import java.util.*;

public class Wl220421_10 {

	public static void main(String[] args) {

//		int[] nArr = new int[10]; ==>난수(0 ~ 9)로 배열 입력
//		단, 중복이 아예 없어야 함.
//		- 1 -

		Random rand = new Random();//따라서, 여기서 괄호 안에 숫자를 집어넣으면 조작이 되는 것임.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 갯수 입력 : ");
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		nArr[0] = rand.nextInt(10);//갯수 : 10
		
		for(int i = 0; i < nArr.length; i++) {
			int j;
			do {
				j = 0;
				nArr[i] = rand.nextInt(10) + 1;//범위 : 1 ~ 10
				
				for(; j < i; j++) {
					if (nArr[j] == nArr[i])
						break;
				}
			} while(j < i);
		}
		System.out.println(Arrays.toString(nArr));
			
		sc.close();
	}//end of main

}//end of class
