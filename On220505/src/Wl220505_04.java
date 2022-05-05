
public class Wl220505_04 {

	public static void main(String[] args) {
		C c = new C(10, 20, 30);
		
		A aa = new A();
		A ab = new B();
		A ac = new C();
		
//		<1> 하위 클래스가 상위 클래스를 참조할 수는 없다!
//		B ba = new A();
		B bb = new B();
		B bc = new C();
		
//		C ca = new A();
//		C cb = new B();
		C cc = new C();
		
//		생성된 인스턴스들의 클래스 간의 포함관계를 비교했을 때
//		1. 형변환을 하더라도, <1>에 위배되므로 에러가 뜬다.
//		C cc1 = (C)bb;
		
//		2. <1>에 위배되지 않으므로 에러가 뜨지 않는다.
		C cc2 = (C)ac;
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
