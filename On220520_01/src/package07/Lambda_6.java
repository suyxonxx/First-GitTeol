package package07;

import java.util.*;

//함수형 인터페이스(Functional Interface) : 추상메서드가 1개만 존재하는 인터페이스.
@FunctionalInterface
interface Cenerator {
	int rand();
}

public class Lambda_6 {
	public static void main(String[] args) {
		Cenerator gen = () -> {
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		int num= gen.rand();
		System.out.println(num);
	}
}
