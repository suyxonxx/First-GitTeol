
public class Wl220425_01 {

	static int num = 100; //class variable
	int i = 10; //instance variable
	
	void func1() {//instance method
		i++; //둘 다
		num++; //사용 가능
	}
	
	static void func2() {//static method (= class method)
//		i++; //여기서 얘는 사용 불가능 ∵static method에서는 instance variable을 날로 쓸 수 없음
		num++;//얘는 사용 가능
	}
}

class abc {
	public static void main(String[] args) {// ← 이녀석이 꼭 public class에만 들어갈 수 있다는 법은
//											     없음
		Wl220425_01 a = new Wl220425_01();
		a.func1();
		System.out.println(a.i);
	}
}
