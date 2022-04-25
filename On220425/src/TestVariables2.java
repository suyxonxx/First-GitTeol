
public class TestVariables2 {

	public static void main(String[] args) {
		Variables2 var1 = new Variables2();
		System.out.println(var1.iv); //인스턴스 변수는 무조건 객체 생성부터 해야 접근 가능하지만..
		
		System.out.println(Variables2.cv); //클래스 변수는 객체를 생성하지 않고도 접근 가능
//											 ∵ 객체 생성 전부터 이미 메모리 공간에 올라가 있기 때문
		Variables2 var2 = new Variables2();
		
		var2.method2();
		
		System.out.println(Variables2.cv++);
		System.out.println(Variables2.cv++);
	}//end of main

}//end of TestVariables2

class Variables2 {
	int iv; //instance variable(=member variable)
	static int cv = 100; //class variable(=정적 변수 = 공유 변수)
//	final static int cv = 100; //← 수정 불가!!
	
	void method () {
		int lv = 0; //local variable
	}
	static void method2() {
		int lv = 0; //local variable
		System.out.println("lv = " + lv);
	}
}//end of Variables2