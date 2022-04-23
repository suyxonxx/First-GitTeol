import java.util.*;

public class Wl220419_04 {

	public static void main(String[] args) {
		
//		기본형, 참조형
//		기본형 --> int, double >> 기본형 변수 공간에는 값이 저장됨
//		참조형 --> String >> 참조형 변수 공간에는 주소값이 저장됨
		System.out.println("-1-");
		String[] name = new String[] {"Kim", "Park", "Lee"};
		
		int[] age = new int[3];
		
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(name));
		
		System.out.println("\n-2-");
		String[] names = {"Kim", "Park", "Lee"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp : " + tmp);
		names[0] = "Yu";
		
		for(String str : names) //향상된 for문.(= for (int i = 0; i < names.length; i++) {})
			System.out.println(str);
		
	}//end of main

}
