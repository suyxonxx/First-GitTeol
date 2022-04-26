
public class Ex02 {
	int iv;
	static int cv;
	
	public static void main(String[] args) {
//		냅다 부르지 말 것
//		System.out.println(iv);
//		func();
		
//		물론 이렇게 해도 안됨!
//		System.out.println(Ex02.iv);
		
//		class variable은 뭐..ㅋ
		System.out.println(cv);
		
//		이렇게 호출이 선행되어야 함
		Ex02 e1 = new Ex02();
		System.out.println(e1.iv);
		System.out.println(e1.cv);
		Ex02 e2 = new Ex02();
		System.out.println(e2.iv);
		System.out.println(e2.cv);
		Ex02 e3 = new Ex02();
		System.out.println(e3.iv);
		System.out.println(e3.cv);
	}
	
	public Ex02() {
		iv++;
		cv++;
	}
	
	void func() {
		System.out.println(iv);
		System.out.println(cv);
	}
}
