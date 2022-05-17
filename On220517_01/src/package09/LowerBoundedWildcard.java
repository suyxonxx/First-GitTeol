package package09;

class Box<T> {
	protected T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	public static <T> void peekBox(Box<? super Integer> box) { //와일드 카드의 하한 제한.(lower bound)
		System.out.println(box);
	}
}

public class LowerBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.setOb(123);
		Unboxer.peekBox(box1);
		
		Box<Number> box2 = new Box<>();
		box2.setOb(12.3);
		Unboxer.peekBox(box2);
		
		Box<Object> box3 = new Box<>();
		box3.setOb("String");
		Unboxer.peekBox(box3);
	}
}
