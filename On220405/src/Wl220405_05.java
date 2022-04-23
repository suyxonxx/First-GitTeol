
public class Wl220405_05 {

	public static void main(String[] args) {
		
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s\n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s\n", y, toBinaryString(y));
		
		System.out.printf("%X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));

	}

	private static Object toBinaryString(int x) {
		
		String zero = "00000000000000000000000000000000"; //32자리
		String tmp = zero + Integer.toBinaryString(x); //32자리 + 8자리 = 40자리
		
		
		return tmp.substring(tmp.length() -32); /*뒤에서 32번째 자리부터의 (= 앞에서 8번째 자리까지 자른 후의) 결과를 내놓으라는 뜻.
												  32bit 값을 도출하기 위한 과정.*/
	}
		
}

