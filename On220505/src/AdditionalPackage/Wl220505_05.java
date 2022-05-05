package AdditionalPackage;

public class Wl220505_05 {

	public static void main(String[] args) {
//		+) Overriding시, 해당 참조변수가 참조하고 있는 인스턴스의 클래스에 속한 메서드가 호출됨.
		A aa = new A();
		aa.testA();
		aa.test();
		
		A ab = new B();
		ab.testA();
		ab.test();
		
		A ac = new C();
		ac.testA();
		ac.test();
		System.out.println("---");
		
		B bb = (B) ab;
		bb.testA();
		bb.testB();
	}
}

class A {
	int a = 1;
	
	A() {}
	A(int a) {
		this.a = a;
	}
	
	void testA() {
		System.out.println("aaa");
	}
	
	void test() {
		System.out.println("AAA");
	}
}

class B extends A {
	int b = 2;
	
	B() {}
	B(int a, int b) {
		super(a);
		this.b = b;
	}
	
	void testB() {
		System.out.println("bbb");
	}
	
	@Override
	void test() {
		System.out.println("BBB");
	}
}

class C extends B {
	int c = 3;
	
	C() {}
	C(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	void testC() {
		System.out.println("ccc");
	}
	
	@Override
	void test() {
		System.out.println("CCC");
	}
}
