package package08;

import java.util.function.*;

public class FuntionEx1 {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		
		System.out.println(f.apply("java"));
		System.out.println(f.apply("JAVA"));
	}
}
