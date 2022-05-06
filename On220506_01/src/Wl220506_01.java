

final class Card{
	String kind;
	int num;
	
	public Card() {
		this("SPADE", 1);
	}
	
	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		if(kind.equalsIgnoreCase("SPADE"))
			return "♠" + kind + "♠ " + num;
		if(kind.equalsIgnoreCase("DIAMOND"))
			return "◆" + kind + "◆ " + num;
		if(kind.equalsIgnoreCase("HEART"))
			return "♥" + kind + "♥ " + num;
		if(kind.equalsIgnoreCase("CLOVER"))
			return "♣" + kind + "♣ " + num;
		else return "?" + kind + "? " + num;
	}
}

public class Wl220506_01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Card c1 = new Card("HEART", 3);
		System.out.println(c1);
		
		Card c2 = Card.class.newInstance();
		System.out.println(c2);
		
//		아래에서, default package일때에 한해서 class 이름만 입력.
//		원래는 "<package 이름>.<class 이름>"의 형식으로 입력해야 함.
		Class cObj = Class.forName("Card");
		
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}
