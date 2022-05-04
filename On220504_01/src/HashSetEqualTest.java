
import java.util.HashSet; //

public class HashSetEqualTest {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		
		set.add(new Num(100));
		set.add(new Num(200));
		set.add(new Num(300));
		set.add(new Num(100));
		set.add(new Num(100));
		set.add(new Num(500));
		
		for(Num n : set)
			System.out.println(n);
		
	} // end of main
}

class Num {
	private int num;
	
	Num(int n) {
		num = n; 
	}
	
//	hashCode의 의의 : 
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return num % 3; //필터링 - 들어온 값들을 3으로 나누었을 때의 나머지 별로 분류
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals"); //필터링을 거친 후, 같은 값이 감지되면 equals 출력
		return num == ((Num)obj).num;
	}
	
	@Override
	public String toString() {
//		Integer.parseInt가 문자열을 정수로 바꾸는 역할을 하는 것과 반대로
//		valueOf는 다른 타입의 변수를 문자열로 바꾸어줌
		return String.valueOf(num);
	}
}
