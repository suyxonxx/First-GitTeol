//Single-ton pattern : 단일 객체를 생성하여 주소를 공유하도록 하는 패턴.
//여러 개의 객체 생성이 불가능하도록 제어됨.
final class SingleTon {
	private static SingleTon s = new SingleTon();
	private SingleTon() {}
	
	public static SingleTon getInstance() {
		System.out.println(s);
		if(s == null) {
			System.out.println("null!~!~!");
			return new SingleTon();
		}
		return s;
	} //end of getInstance
} //end of class SingleTon

public class SingleTonTest {
	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getInstance();
		System.out.println(s1);
		
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s2);
	} //end of main
} //end of class SingleTonTest
