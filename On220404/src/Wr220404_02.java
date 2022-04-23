
public class Wr220404_02 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		int first = 'A';
		System.out.println(first);
		System.out.printf("example of encoding : %c → %d%n", first, first);
		System.out.printf("example of decoding : %d → %c%n", first, first);
		
		char second = 'B';
		int duljjae = (int)second; //교재에는 이렇게 (int)를 써주라고 나오긴 하는데, 사실 안쓰고 돌려도 멀쩡학게 잘 돌아감ㅋㅋㅋㅋㅋㅋ
		System.out.println(duljjae);
		
		short third = 98;
		char setjjae = (char)third;
		System.out.println(setjjae);
		System.out.println("");

		System.out.println("-2-");
		int a = 10;
		int b = 4;
		
		System.out.printf("%d ÷ %d = %d%n", a , b, a / b);
		System.out.printf("%d = %d × %d + %d%n", a , b, a / b, a % b);
		System.out.printf("%d를 %f로 나누면 %f가 나온답니당^^%n", a, (float)b, a / (float)b);
//		System.out.printf("%d를 %f로 나누면 %f가 나온답니당^^%n", a, b, (a / b)); ←이거 에러남.
//		System.out.printf("%f를 %f로 나누면 %f가 나온답니당^^%n", a, b, (a / b)); ←이것두 에러남.
		
	}

}

