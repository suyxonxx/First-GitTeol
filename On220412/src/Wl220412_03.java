
public class Wl220412_03 {

	public static void main(String[] args) { // ~ void : 아무것도 돌려주지 않음.
//														  → return문을 생략.
		
//		3) 함수에서 입력(X), 출력(O)
//		main 입장 : 받기만 했소
//		double dnum = 2.5;
//		int num2 = 5;
		
		System.out.println("main() 함수!!");
		
		double n = sub();
		
		System.out.println("결과 값 : " + n);
	}
	
	public static double sub() { //~ double : double형의 변수를 돌려줄 것임.
		
		double dnum = 12.5;
		
		System.out.println("sub() 함수...");
		
		return dnum;
	}
}

