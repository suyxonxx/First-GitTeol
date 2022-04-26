
public class Exercise6_2_o {

	public static void main(String[] args) {
		
		SutdaCard2 card1 = new SutdaCard2(3, false);
		SutdaCard2 card2 = new SutdaCard2();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard2 {
	int num;
	boolean isKwang;
	
	public SutdaCard2() {
//		this.num = 1; //--1
//		this.isKwang = true; //--1
		
//		defalut 값을 알아서 설정해주면 될 뿐, 무조건 비워놓아야 한다는 법은 없음!
		this(1, true); //--2
	}
	
	public SutdaCard2(int num, boolean isKwang) {
		if(num > 1 && num <= 10)
			this.num = num;
		else
			this.num = 0;
		
		this.isKwang = isKwang;
	}
	
	String info() {
//		return num + (isKwang == true ? "K" : ""); //--1
		return num + (isKwang ? "K" : ""); //--2
	}
	
}
