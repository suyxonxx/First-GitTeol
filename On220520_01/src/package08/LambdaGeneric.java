package package08;

@FunctionalInterface
interface Calculate<T> {
	T cal(T a, T b);
}

public class LambdaGeneric {
	public static void main(String[] args) {
		Calculate<Integer> c1 = (a, b) -> a + b;
		System.out.println(c1.cal(10, 10));
		
		Calculate<Double> c2 = (a, b) -> a * b;
		System.out.println(c2.cal(2.5, 3.6));
	}
}
