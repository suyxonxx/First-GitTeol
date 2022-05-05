
public class Wl220505_02 {
	
	public static void main(String[] args) {
//		반환형 : X, 매개전달 : X
		sum1();
		
//		반환형 : X, 매개전달 : O
		sum2(10, 20);
		
//		반환형 : O, 매개전달 : O
		int num1 = sum3(10, 20);
		System.out.println(num1);
		
//		반환형 : O, 매개전달 : X
		int num2 = sum4();
		System.out.println(num2);
		
	} //end of main
	
	static void sum1() {
		System.out.println("Nothing...");
	}
	static void sum2(int i, int j) {
		System.out.println(i + j);
	}
	static int sum3(int i, int j) {
		return i + j;
	}
	static int sum4() {
		return 100;
	}
}
