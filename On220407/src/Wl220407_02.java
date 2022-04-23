
public class Wl220407_02 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		char ch1 = 'z';
		
		//Made by me
		boolean b = ((ch1 >= 48 && ch1<= 57) || (ch1 >= 65 && ch1<= 90) || (ch1 >= 97 && ch1<= 122));
		
		//Made by others
//		boolean b = ((ch1 >= '0' && ch1 <= '9') || (ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z'));
		
		System.out.println(b);
		
		System.out.println("\n-2-");
		char ch2 = 'D';
		
		//Made by me
		char lowerCase = (char)((ch2 < 97) ? (ch2 + 32) : ch2);
//		char lowerCase = (char)((ch2 >=65 && ch2<= 90) ? ch2 + 32 : (ch2 >= 97 && ch2 <= 122) ? ch2 : '×');
		
		//Made by others
//		char lowerCase = ('A' <= ch2 && ch2 <= 'Z') ? (char)(ch2 + 32) : ch2;
		
		System.out.println("ch2 : " + ch2);
		System.out.println("ch2 to lowercase is " + lowerCase);

		System.out.println("\n-3-");
		System.out.println("1. int형 변수 x가 10보다 크고 20보다 작을 때 true");
		int x = 0;
		System.out.println(x>10 && x<20);

		System.out.println("\n2. char형 변수 ch01이 공백이나 탭이 아닐 때 true");
		char ch01 = ' ';
		//Made by me
		System.out.println(!(ch01==' ' || ch01 == '\t')); //<---\t는 내가 생각해낸 것이 아님.
		//Made by others
		System.out.println(ch01 !=' ' || ch01 != '\t');

		System.out.println("\n3. char형 변수 ch02가 'x' 또는 'X' 일때 true");
		char ch02 = 'x';
		System.out.println(ch02 == 'x' || ch02 == 'X');

		System.out.println("\n4. char형 변수 ch03이 숫자('0' ~ '9')일 때 true");
		char ch03 = ' ';
		System.out.println(ch03>='0' && ch03<='9');

		System.out.println("\n5. char형 변수 ch04가 영문자(대문자 또는 소문자)일 때 true");
		char ch04 = ' ';
		System.out.println((ch04 >= 'A' && ch04 <= 'Z') || (ch04 >= 'a' && ch04 <= 'z'));

		System.out.println("\n6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true");
		int year = 2022;
		//Made by me
		System.out.println((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0));
		//Made by others
		System.out.println(((year % 400 == 0) || (year % 4 == 0)) && (year % 100 != 0));

		System.out.println("\n7. boolean형 변수 powerOn이 false일 때 true");
		boolean powerOn = false;
		System.out.println(!powerOn);

		System.out.println("\n8. 문자열 참조변수 str이 \"yes\"일 때 true");
		String str = "yes";
		//Made by me
		System.out.println(str == "yes");
		//Made by others
		System.out.println(str.equals("yes"));
		
	}

}

