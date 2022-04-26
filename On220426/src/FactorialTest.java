
public class FactorialTest {

	public static void main(String[] args) {
		
		int result = factorial(4);
		
		System.out.println(result);
	}
//	재귀호출의 사용은 가급적 지양하는 것이 좋다.
	static int factorial(int n) {
		if(n == 1)
			return 1;
		
		return n * factorial (n-1);
	}

}
