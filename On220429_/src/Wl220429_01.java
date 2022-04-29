
public class Wl220429_01 {
	public static void main(String args[]) {
//		abstract class의 객체를 직접 생성하는 것은 불가능하지만,
//		abstract class의 하위 클래스의 객체를 생성함으로써 접근이 가능함
		Product pro = new Tv();
		
		System.out.println(pro.price);
		pro.test();
		pro.func();
	}
}

abstract class Product {
	int price; // 제품의 가격
	
	Product(int price) {
		this.price = price;
	}
	void test() {
		System.out.println("Product");
	}
//	▼ 추상메서드(body를 가질 수 없음) : 강제적으로 하위 클래스에서 오버라이딩을 통해 구현시켜야 함.
	abstract void func();
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }

	@Override
	void func() {
		System.out.println("테레비");
	}
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer";}
	
	@Override
	void func() {
		System.out.println("컴퓨터");
	}
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
	
	@Override
	void func() {
		System.out.println("오디오");
	}
}
