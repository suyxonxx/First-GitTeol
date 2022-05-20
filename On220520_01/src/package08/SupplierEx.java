package package08;

import java.util.*;
import java.util.function.*;

public class SupplierEx {				/*	Random rand = new Random();	*/
										/*	return rand.nextInt(50);	*/
	public static List<Integer> makeIntList(Supplier<Integer> s, int n) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
			list.add(s.get());
		
		return list;
	} //end of makeIntList
	
	public static void main(String[] args) {
//		입력 X, 출력 O => get
		Supplier<Integer> spr = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		List<Integer> list = makeIntList(spr, 5);
		System.out.println(list);
		
		Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
		
		for(int i = 0; i < 5; i++)
			System.out.print(s.get() + "  ");
		System.out.println();
	} //end of main
}
