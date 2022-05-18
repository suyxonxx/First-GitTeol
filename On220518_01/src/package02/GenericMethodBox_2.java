package package02;

class Box<T> {
	private T ob;
	
	public void set(T o) {ob = o;}
	public T get() {return ob;}
}

class UnBoxer {
//	Generic Method
	public static <T> T makeBox(Box<T> box) {
		return box.get();
	}
}

public class GenericMethodBox_2 {
	public static void main(String[] args) {
		Box<String> sBox = new Box<>();
		
		sBox.set("Generic Method");
		
		System.out.println(sBox.get());
		
		String str = UnBoxer.makeBox(sBox);
//		위의 문장을 아래와 같이 쓸 수도 있음
//		String str = UnBoxer.<String>makeBox(sBox);
//		String str = UnBoxer.<>makeBox(sBox);
		
		System.out.println(str);
	}
}
