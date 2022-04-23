
public class Wr220401_02 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		int bin = 0b100;
		int oct = 0100;
		int dec = 100;
		int hex = 0x100;
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(dec);
		System.out.println(hex);
		System.out.println("");

		System.out.println("-2-");
		System.out.println(Integer.toBinaryString(bin)); //2진법으로 출력하라
		System.out.println(Integer.toOctalString(oct)); //8진법으로 출력하라
		System.out.println(Integer.toHexString(hex)); //16진법으로 출력하라
		System.out.println("");

		System.out.println("-3-");
		System.out.printf("%o%n", oct);
		System.out.printf("%d%n", dec);
		System.out.printf("%x%n", hex);
		System.out.println("");
//		추가) 8진법 예시 : 01011 = 01_011 = 13 ∵ 01은 둘째자리(1), 011은 첫째자리(3)
		
		System.out.println("-4-");
		int a = 11;
		int b = 22;
		
//		자릿수를 맞춰볼까요?
		System.out.printf("%d%n%d%n", a, b);
		System.out.printf("%3d%n%3d%n", a, b);
		System.out.printf("%4d%n%4d%n", a, b);
		System.out.println("");

		System.out.println("-5-");
		short c = (byte)500;
		System.out.println(c);
		
		int d = (short)50000;
		System.out.println(d);
//		강제형변환과 오버플로우의 합작
		System.out.println("");

		System.out.println("-6-");
		short cRe = 500;
		int dRe = 50000;
		System.out.println(cRe+dRe);
//		자료형(변수의 종류)이 일치하는 변수들끼리는 연산 가능
		
	}

}

