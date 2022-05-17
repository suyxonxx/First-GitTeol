package package05;

class Box<T> {
	protected T ob;
	public void setOb(T ob) {this.ob = ob;}
	public T getOb() {return ob;}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T t) {ob = t;}
}

public class GenericInheritance {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox<>(1000000000);
		Box<String> sBox = new SteelBox<>("OneBillion");
		
		System.out.println(iBox.getOb());
		System.out.println(sBox.getOb());
	}
}
