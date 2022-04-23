
public class Wl220419_11 {

	public static void main(String[] args) {
		
//		다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
//		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한 지 계산해서 출력하라.
//		단, 가능한 한 적은 수의 동전으로 거슬러 주어야 한다.
//		(1)에 알맞은 코드를 넣어서 프로그램을 완성하라.
//		[Hint] 나눗셈 연산자와 나머지 연산자를 사용하라.
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
//		int moneyOringinal = money;
//		System.out.println("money = " + moneyOriginal);
		
		for(int i = 0; i < coinUnit.length; i++) {
				int coinCount = money / coinUnit[i];
				System.out.println(coinUnit[i] + "원 짜리 동전 " + coinCount + "개");
				money %= coinUnit[i];
		}//end of for
		
	}//end of main

}//end of class
