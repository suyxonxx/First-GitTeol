//overriding
class Parent2 {
	int x = 100;
	
	Parent2() {
		this(200);
	}
	
	Parent2(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

class Child extends Parent2 {
	int x = 3000;
	
	Child() {
		this(1000);
	}
	
	Child(int x) {
		this.x = x;
	}
	
	int getX() {
		return x;
	}
}

public class Wl220427_02 {
	
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x = " + c.getX());
	}
}
