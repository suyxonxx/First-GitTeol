package package06;

class Box<T> {
	protected T ob;
	public T getOb() {return ob;}
	public void setOb(T ob) {this.ob = ob;}
}

class EmptyBoxFactory {
	public static <T> Box<T> makeBox() {
		Box<T> box = new Box<T>();
		return box;
	}
}

public class TargetTypes {
	public static void main(String[] args) {
//		<Integer>를 쓰거나 말거나는 자유임.
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
//		Box<Integer> iBox = EmptyBoxFactory.makeBox();
		
		iBox.setOb(25);
		
		System.out.println(iBox.getOb());
	}
}
