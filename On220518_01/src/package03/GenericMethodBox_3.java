package package03;

class Box<T> {
	private T ob;
	
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}

class BoxFactory {
//	Generic Method
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box<T>();
		box.set(o);
		System.out.println("Box data : " + o.intValue());
		return box;
	}
}

class UnBoxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("UnBoxer Data : " + box.get().intValue());
		return box.get();
	}
}

public class GenericMethodBox_3 {
	public static void main(String[] args) {
		Box<Integer> iBox = BoxFactory.makeBox(777);
//		위의 문장은 아래와 같이 쓸 수도 있음.
//		Box<Integer> iBox = BoxFactory.makeBox(new Integer(777));
		
		int num = UnBoxer.openBox(iBox);
		System.out.println("result : " + num);
	}
}
