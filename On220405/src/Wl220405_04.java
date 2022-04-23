import java.util.Scanner;

public class Wl220405_04 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		System.out.println(a>0 & b>0); //AND
		System.out.println(a>0 | b>0); //OR
		System.out.println(a>0 ^ b>0);
		System.out.println(" ");
		System.out.println(!(a>0 & b>0)); //! : 논리 부정 연산자.
		System.out.println(!(a>0 | b>0));
		System.out.println(!(a>0 ^ b>0));
		System.out.println(" ");
		
		int i =21;
		System.out.println(i%2 ==0 || (i%3 ==0 && i%6 != 0)); //우선순위가 애매한 경우, 중괄호(형태는 소괄호지만 뭐 어쨌든.)를 활용.
		System.out.println(" ");
		
		char ch = 'a';
		System.out.println(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z'));
						   //97   ≤   ch   ≤   122  or  65    ≤   ch   ≤    90 일 경우, true
		System.out.println(" ");
		
		String str = "Korea";
		System.out.println(str.charAt(3)); //charAt(n)의 의미 : (n+1)번째 문자를 출력해줌. ∵ 첫번째가 0!
		System.out.println(" ");
		
		Scanner sc = new Scanner (System.in);
		char chh = ' ';
		
		System.out.printf("문자를 하나 입력하세요 ☞☞☞☞ ☞");
		
		String input = sc.nextLine();
		chh = input.charAt (0);
		
		if('0' <= chh && chh <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다 \n");
		}
		
		if(('a' <= chh && chh <= 'z') || ('A' <= chh && chh <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다 \n");
		}
		
		sc.close();
		
	}

}

