//super를 통해 엄빠 소환
class Parent3 {
	int x = 100;
	
	Parent3() {
		this(200);
	}
	
	Parent3(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child3 extends Parent3 {
	int x = 3000;
	
	Child3() {
		this(1000);
	}
	
	Child3(int x) {
		this.x = x;
	}
	
	int getX() {
		return super.getX();
	}
}

public class Wl220427_03 {
	
	public static void main(String[] args) {
		Child3 c = new Child3();
		System.out.println("x = " + c.getX());
	}
}
