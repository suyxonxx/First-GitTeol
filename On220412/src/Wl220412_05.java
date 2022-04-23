
public class Wl220412_05 {

	public static void main(String[] args) {
		
//		A. 구구단 함수. n을 입력하면 n단 출력
//		A-1. 이 경우, 입력(O), 출력(X)
		int input = 2;
		
		ggd(input);
	}

	public static void ggd (int n) {//뭘 돌려주지 않을 예정이면 무조건 void!!
		
		System.out.println(n + "단 출력");
		
		for(int i = 1; i <=9; i++)
			System.out.printf("%d × %d = %2d\n", n, i, (n * i));
	}
}

