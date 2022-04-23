
public class Wl220412_01 {

	public static void main(String[] args) {//일종의 메인 함수.
		
//		1) 함수에서 입력(X) & 출력(X)
//		main 입장 : 폭탄돌리기만 하였소
		System.out.println("main() 함수!!");
		sub(); //♠ - 함수 호출 → 제어건을 sub 함수쪽으로 넘김
		System.out.println("main()2 함수!!");
		
		
	}//end of main
	
	//함수가 존재하면 반드시 다른 곳(main 등)에서 호출해야한다.(♠)
	public static void sub() {
		System.out.println("서브 함수 입니다.");
	}

}

