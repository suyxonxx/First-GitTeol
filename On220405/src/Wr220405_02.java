
public class Wr220405_02 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		char aSmlLet = 'a';
		int i;
		for (i = 0; i < 26; i++) {
			System.out.print(aSmlLet++);
		}
			System.out.println("\n");

		System.out.println("-2-");
		char aBigLet = 'A';
		for (int j = 0; j<=25; j++) {
			System.out.print(aBigLet++);
		}
		System.out.println("\n");
		
		System.out.println("-3-");
		char bSmlLet = 'b';
		for(int j = 0; j < 20; j++) {
			System.out.print(++bSmlLet);
		}
//		참고로 말하자면, 위의 경우 i++ or ++i, j++ or ++j는 영향이 없음. 이유는 전날 배운 내용으로부터 유추 가능.
//		실제 콘솔창에 도출되는 값에 영향을 주는 건 print 뒤 괄호에서의 ~++ or ++~ 임.
	}
	
}

