
public class StringBufferEx1 {

	public static void main(String[] args) {
//		equals method에 주목! (교재 479p)
		String s01 = new String("abc");
		String s02 = new String("abc");
		
		System.out.println("s01 == s02 ?   " + (s01 == s02) + " !");
		System.out.println("s01.equals(s02) ?   " + s01.equals(s02) + " !");
		System.out.println("---------------------------");
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb1 == sb2 ?   " + (sb1 == sb2) + " !");
		System.out.println("sb1.equals(sb2) ?   " + sb1.equals(sb2) + " !");
		
//		StringBuffer의 내용을 String으로 변환한다.
		String s1 = sb1.toString(); //String s1 = new String sb1;과 같다.
		String s2 = sb2.toString();
				
		System.out.println("s1.equals(s2) ?   " + s1.equals(s2) + " !");
	}
}
