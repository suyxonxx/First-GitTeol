package package07;

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
//	제네릭을 기반으로 하므로, public static 뒤의 <T> 생략 불가
	public static <T> T openBox(Box<T> box) { //제네릭 기반 메서드 정의
		return box.getOb();
	}
	
//	와일드카드를 기반으로 하므로, public static 뒤의 <T> 생략 가능
	public static <T> void peekBox(Box<?> box) { //와일드카드 기반 메서드 정의
		System.out.println(box);
	}
}

public class WildcardUnBoxer {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("apple");
		Unboxer.peekBox(box);
	}
}
