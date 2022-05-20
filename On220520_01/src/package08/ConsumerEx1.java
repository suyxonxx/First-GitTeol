package package08;

import java.util.function.*;

public class ConsumerEx1 {
	public static void main(String[] args) {
		Consumer<String> c1 = s -> System.out.println(s);
		
		c1.accept("consumer");
		
		c1.accept("CONSUMER");
		
		ObjIntConsumer<String> c2 = (s, i) -> System.out.println(i + ", " + s);
		ObjDoubleConsumer<String> c3 = (s, d) -> System.out.println(d + ", " + s);
		
		int n = 1;
		double d = 1.1;
		
		c2.accept("toy", n++);
		c2.accept("robot", n++);
		c2.accept("box", n++);

		c3.accept("toy", d++);
		c3.accept("robot", d++);
		c3.accept("box", d++);
	}
}
