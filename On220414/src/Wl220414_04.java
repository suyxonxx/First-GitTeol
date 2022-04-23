import java.util.Scanner;

public class Wl220414_04 {

	public static void main(String[] args) {
		
		System.out.println("-1_1-");
		char daemunja = (char)((int)(Math.random() * 25 + 65));
		System.out.println(daemunja);
		
		char somunja = (char)(daemunja + 32);
		System.out.println(somunja);
		
		System.out.println("\n-1_2-");
		float pi = 3.141592f;
		
		float shortPi = (int)(pi*1000)/1000f;
		
		System.out.println(shortPi);

		shortPi = (int)(pi*1000 + 0.5f);
		
		System.out.println((int)shortPi);
		
		System.out.println("\n-2-");
		Scanner sc = new Scanner(System.in);
		String s3 = new String("java");
		String s4 = sc.nextLine();
		
		System.out.println(s3 == s4);
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		sc.close();
		
	}

}

