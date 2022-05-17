package package10;

class Box<T> {
	protected T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Toy {
	@Override
	public String toString() {
		return "I am a toy";
	}
}

class Robot extends Toy {}

class BoxHandler {
	public static void outBox(Box<? extends Toy> box) { //get 역할이 주어진 메서드
		Toy t = box.getOb();
		System.out.println(t);
//		box.setOb(t); //논리적 오류 발생
	}
	
	public static void inBox(Box<Toy> box, Toy t) { //set 역할이 주어진 메서드
		box.setOb(t);
//		Toy t2 = box.getOb(); //논리적 오류 발생
	}
}

public class BoundedWildcard {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
