import java.util.*;

public class Wl220415_05 {

	public static void main(String[] args) {
		
//		if문을 사용하여 다섯 개 정수를 입력 받아서 가장 큰 수를 출력하는 프로그램 작성
//		아래는 배열을 사용한 방법인데, 풀이에 요구된 방식이 아니므로 오답.
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번째 정수 입력 ▼\n", (i + 1));
			arr[i] = sc.nextInt();
			}

		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[0])
				arr[0] = arr[i];
		}
		
		System.out.println("Max Number is " + arr[0]);
		
		sc.close();
		
	}

}

