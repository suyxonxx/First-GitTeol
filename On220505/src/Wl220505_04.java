
public class Wl220505_04 {

	public static void main(String[] args) {
		C c = new C(10, 20, 30);
		System.out.println(c.a);
		
		A aa = new A();
		A ab = new B();
		A ac = new C();
		
		B bba = (B)aa;
		
//		하위 클래스가 상위 클래스를 참조할 수는 없다!
//		B ba = new A();
		B bb = new B();
		B bc = new C();
		
//		C ca = new A();
//		C cb = new B();
		C cc = new C();
	}
}

class A {
	int a = 1;
	
	A() {}
	A(int a) {
		this.a = a;
	}
}

class B extends A {
	int b = 2;
	
	B() {}
	B(int a, int b) {
		super(a);
		this.b = b;
	}
}

class C extends B {
	int c = 3;
	
	C() {}
	C(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
}
