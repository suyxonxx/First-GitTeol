
public class Wr220405_01 {

	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		int c3 = 'A';
		int c4 = 65;
		char c5 = (char) c4;
		
		System.out.println("-1-");
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.printf("%c%n", c1);
//		System.out.printf("%d%n", c1); //←얜 오류남. c2, c5도 마찬가지임.
//		마치 최대로 A4사이즈의 인쇄물까지 출력 가능한 프린터기에서 A2사이즈의 인쇄물 출력을 시도한 것 같은 느낌인가봄.
		System.out.println("");
		
		System.out.println("-2-");
		System.out.println(c2);
		System.out.println((int)c2);
		System.out.printf("%c%n", c2);
		System.out.println("");
		
		System.out.println("-3-");
		System.out.println(c3);
		System.out.println((char)c3);
		System.out.printf("%d%n", c3);
		System.out.printf("%c%n", c3);
		System.out.println("");
		
		System.out.println("-4-");
		System.out.println(c4);
		System.out.println((char)c4);
		System.out.println("");
		
		System.out.println("-5-");
		System.out.println(c5);
		System.out.println((int)c5);
		System.out.printf("%c%n", c5);
		System.out.println("");

		System.out.println("-5-");
		char cc1 = 'a';
		char cc2 = 'a' + 1; //얜 컴파일 에러가 발생하지 않음.
//		char cc2 = cc1 + 1; ←얜 에러남.
//		char cc2 = cc1 + (char)1; ←이런 갯벌짓도 안통함^^
		char cc3 = (char)(cc1 + 1); //차라리 이렇게 하시죠^^
		System.out.println(cc2);
		System.out.println(cc3);
		
	}

}

