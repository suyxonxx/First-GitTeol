package package08;

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
	public static <T> void peekBox(Box<? extends Number> box) { //와일드 카드의 상한 제한.(upper bound)
		System.out.println(box);
	}
}

public class UpperBoundedWildcard {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		
		box1.setOb("apple");
		System.out.println(box1.getOb());
//		Unboxer.peekBox(box1); //←error.
		
		Box<Integer> box2 = new Box<>();
		
		box2.setOb(100);
		System.out.println(box2.getOb());
		Unboxer.peekBox(box2);
	}
}
