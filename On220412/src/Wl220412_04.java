
public class Wl220412_04 {

	public static void main(String[] args) {
//		4) 함수에서 입력(O), 출력(O)
		int n1 = 5, n2 = 10;
		
		int print1 = sub1(n1, n2);
		System.out.println("print1 : " + print1);
		
		int n = sub2(n1, n2);
		int print2 = sub1(n, n2);
		System.out.println("print2 : " + print2);
		
		int print3 = sub1(n1, n1);
		System.out.println("print3 : " + print3);
		
		int print4 = sub1(n2, n2);
		System.out.println("print4 : " + print4);
		
	}
	
	public static int sub1(int i, int j) {
		int result = i * j;
		return result;
	}
	
	public static int sub2(int i, int j) {
		int result = i + j;
		return result;
	}
	
}

