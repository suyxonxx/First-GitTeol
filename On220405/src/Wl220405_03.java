
public class Wl220405_03 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double realshortPi = (pi * 1000) / 1000.0;
		System.out.println(realshortPi);
		
		double shortPi = Math.round(pi * 1000) / 1000.0; //소수점 첫째자리에서 반올림.
		double shortkiloPi = Math.round(pi * 1000);
		System.out.println(shortPi);
		System.out.println(shortkiloPi);
		System.out.println(" ");
		
		int x = 10;
		int y = 8;
		
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(x % -y);
		System.out.printf("%d = %d * %d + %d%n", x, y,  x / y, x % y);
		System.out.println(" ");
		
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y); //좌항이 기준. => or =< 이딴거 안됨.
		System.out.println(x <= y);
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(" ");
		
		String str1 = "abc";
		String str11 = "abc";
		
		System.out.println("str1 == str11 is " + (str1 == str11));
		System.out.println(" ");
		
		
		String str2 = new String ("abc"); // String 클래스의 객체를 생성 / new는 연산자의 일종임.
		String str3 = new String ("abc");
		
		System.out.println("str2 == str3 is " + (str2 == str3));
		System.out.println(" ");
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
		System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
		System.out.println(" ");
		
		//equals()는 두 문자열의 내용이 같으면 true, 다르면 false
		System.out.printf("str1.equals (\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals (\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals (\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase (\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
	}

}

