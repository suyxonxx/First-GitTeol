
public class Wl220419_06 {

	public static void main(String[] args) {
		
		String src = "ABCDE";
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + ") : " + ch);
		}
		
		char[] chArr = src.toCharArray();
		
		System.out.println(chArr);
		
		String msg = "korea";
		chArr = msg.toCharArray(); //String을 Character 하나하나로 쪼개서 배열로 만듬.
		System.out.println(chArr);
		
	}//end of main

}
