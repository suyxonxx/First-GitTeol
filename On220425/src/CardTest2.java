
public class CardTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("Card2 width = " + Card2.width);
		System.out.println("Card2 height = " + Card2.height + System.lineSeparator());
		
		Card2 c1 = new Card2();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card2 c2 = new Card2();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("
							+ Card2.width + ", " + Card2.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 ("
		+ Card2.width + ", " + Card2.height + ")" + System.lineSeparator());
		
		System.out.println("c1과 c2의 width와 height를 각각 50, 80으로 변경합니다."
							+ System.lineSeparator());
		
		Card2.width = 50;
		Card2.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("
				+ Card2.width + ", " + Card2.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 ("
				+ Card2.width + ", " + Card2.height + ")" + System.lineSeparator());
	}//end of main
	
}//end of CardTest2

class Card2 {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}//end of card2