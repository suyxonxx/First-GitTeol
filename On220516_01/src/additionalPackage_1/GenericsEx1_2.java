package additionalPackage_1;

class Apple {
	@Override
	public String toString() {
		return "사과";
	}
}

class Orange {
	@Override
	public String toString() {
		return "오렌지";
	}
}

//아래처럼, Template의 약자로써 대문자 T가 많이 사용됨.
class Box<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

public class GenericsEx1_2 {
	public static void main(String[] args) {
//		코딩 시 제네릭 사용은 선택이 아닌 필수라고 함.
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.setOb(new Apple());
		oBox.setOb(new Orange());
		
		Apple ap = aBox.getOb();
		Orange or = oBox.getOb();
		
		System.out.println(ap);
		System.out.println(or);
		
//		aBox.setOb("new Apple()"); // X
		aBox.setOb(new Apple()); // O
		
		java.util.List<String> list = new java.util.ArrayList<String>();
		
		list.add("10"); // O
		list.add("str"); // O
//		list.add(new Apple()); // X
	}
}
