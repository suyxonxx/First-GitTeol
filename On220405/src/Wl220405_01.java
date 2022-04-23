
public class Wl220405_01 {

	public static void main(String[] args) {
		
		char c1 = 'A';
		int c2 = 65;
		char c3 = (char)c2;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char b1 = 'a';
		char b2 = 'a' + 1; //에러가 나지 않음. ∵ 컴파일 간의 연산.
		System.out.println(b2);
		
		char b3 = (char)(b1 +1); /*쌩으로 char b3 = b1 + 1; 이라고 치면 에러남.
								    아 그리고 우항에 b1 + (char)1을 넣는 뻘짓 다신 하지 말기를 바라^^*/
		System.out.println(b3);

	}

}

