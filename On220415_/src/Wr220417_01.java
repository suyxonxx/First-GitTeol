
public class Wr220417_01 {
	
	public static void main(String[] args) {
		
//		여러가지 줄바꿈 방법
		System.out.println("\n1. LF (Line Feed)");
		System.out.println("ohoh\nohoh");
		
		System.out.println("\r2. CR (Carriage Return)");
		System.out.println("ohoh\rohoh");
		
		System.out.println("\r\n3. CR + LF");
		System.out.println("ohoh\r\nohoh");
		
		System.out.println(System.lineSeparator() + "4. Method 이용");
		System.out.println("ohoh" + System.lineSeparator() + "ohoh");
		System.out.println("ohoh" + System.getProperty("line.separator") + "ohoh");
		
	}//end of main

}

