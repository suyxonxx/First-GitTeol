
public class Wl220412_02 {

	public static void main(String[] args) {
//		2)함수에서 입력(O), 출력(X)
//		main 입장 : 주기만 했소
		int num = 2;
		int num2 = 5;
		short n = (short)num;
		short n2 = (short)num2;
		sub(n, n2);//←함수 호출 (인자변수)
//		인자들을 함수로 input 시, 자동 형변환을 고려해야 함!
	}
		
		public static void sub(short i, short j) {//←매개변수
			System.out.println("두 수의 합 : " + (i + j));
	}

}
	