
public class TestVariables {

	public static void main(String[] args) {
		
		Variables var1 = new Variables();
		
		var1.iv++;
		var1.cv++; //class variable
		System.out.println("var1.iv : " + var1.iv);
		System.out.println("var1.cv : " + var1.cv);
		
		Variables var2 = new Variables();
		var2.iv++;
		var2.cv++;
		System.out.println("var2.iv : " + var2.iv);
		System.out.println("var2.cv : " + var2.cv);
		
		Variables var3 = new Variables();
		var3.iv++;
		var3.cv++;
		System.out.println("var3.iv : " + var3.iv);
		System.out.println("var3.cv : " + var3.cv);
		System.out.println("--------------------");
		Variables var4 = new Variables();
		System.out.println(var4.iv); //인스턴스 변수는 객체 생성 후 사용해야 함
		
		
	}//end of main

}//end of TestVariables

class Variables {
	int iv; //instance variable(=member variable)
	static int cv; //class variable(=정적 변수 = 공유 변수)
	
	void method () {
		int lv = 0; //local variable
	}
}//end of Variables