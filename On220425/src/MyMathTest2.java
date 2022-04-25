
class MyMath2 {
	long a, b;
	
//	인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요 없음
	long add() {
		return a + b; //여기서 a, b는 인스턴스 변수
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	long divide() {
		return a / b;
	}
	
//	인스턴스변수와 관계 없이 매개변수만으로 작업 가능
	static long add (long a, long b) {
		return a + b; //여기서 a, b는 지역 변수
	}
	static long subtract (long a, long b) {
		return a - b;
	}
	static long multiply (long a, long b) {
		return a * b;
	}
	static double divide (double a, double b) {
		return a / b;
	}
//	static long add
}

public class MyMathTest2 {

	public static void main(String[] args) {
		
//		클래스메서드 호출. 인스턴스 생성 없이 호출 가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2(); //인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		
//		인스턴스 메서드는 객체 생성 후에만 호출 가능.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}

}
