package package08;

import java.util.*;
import java.util.function.*;

public class PridicateEx01 {
	public static int sum(Predicate<Integer> p, List<Integer> lst) {
		int sum = 0;
		for(int n : lst)
			if(p.test(n))
				sum += n;
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 7, 8, 10, 11, 12);
		
		int result;
		result = sum(n -> n % 2 == 0, list);
		System.out.println("짝수 합 : " + result);
		
		result = sum(n -> n % 2 == 1, list);
		System.out.println("홀수 합 : " + result);
		
		Predicate<Integer> p1 = n -> n % 2 == 0;
		System.out.println(p1.test(2));
		System.out.println(p1.test(3));
		
		Predicate<Integer> p2 = i -> i < 100;
		System.out.println(p2.test(50));
		System.out.println(p2.test(150));
	}
}
