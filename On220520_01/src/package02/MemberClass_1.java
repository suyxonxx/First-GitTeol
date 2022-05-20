package package02;

/*Member inner class*/

class Outer {
	private int num = 0;
	
	class Member {
		void add(int n) {num += n;}
		int get() {return num;}
	}
}

public class MemberClass_1 {
	public static void main(String[] args) {
		Outer out1 = new Outer();
		Outer out2 = new Outer();
		
		Outer.Member mem1 = out1.new Member();
		Outer.Member mem2 = out2.new Member();
		
		mem1.add(5);
		System.out.println(mem1.get());
		mem2.add(10);	
		System.out.println(mem2.get());
	}
}
