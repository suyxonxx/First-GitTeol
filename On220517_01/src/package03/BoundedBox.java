package package03;
/* 
 * 아래와 같이 제한을 걸어둘 경우, T에 올 수 있는 대상은 Number이거나 Number를 상속한 객체로 제한됨.
 * 
 * < +α >
 * The java.lang.Number class is the superclass of classes BigDecimal, BigInteger, Byte, Double,
 * Float, Integer, Long, and Short. The Subclasses of Number must provide methods to convert
 * the represented numeric value to byte, double, float, int, long, and short.
 */
class Box<T extends Number> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class BoundedBox {
	public static void main(String[] args) {
		Box<Double> aBox = new Box<>(); //OK ∵class Double extends Number
//		Box<String> sBox = new Box<>(); //ERROR ∵class String doesn't extends Number
		
		aBox.set(10.02);
		System.out.println(aBox.get());
	}
}
