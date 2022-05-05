
public class Wl220505_03 {

	public static void main(String[] args) {
		Test1 t0 = new Test1();
		Test1 t1 = new Test1(10);
		Test1 t2 = new Test1(10, 20);
		Test1 t3 = new Test1(10, 20, 30);
	}
}

class Test1 {
	int a;
	int b;
	int c;
	
	public Test1() {
		this(0, 0, 0);
	}
	public Test1(int a) {
		this(a, 0, 0);
	}
	public Test1(int a, int b) {
		this(a, b, 0);
	}
	public Test1(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
