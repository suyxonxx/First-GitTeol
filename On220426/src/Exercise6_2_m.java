
public class Exercise6_2_m {

	public static void main(String[] args) {
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {}
	
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return ((num == 0 && isKwang == false) ? "1K" : ((isKwang == true)
					? Integer.toString(num) + "K" : Integer.toString(num)));
	}
}
