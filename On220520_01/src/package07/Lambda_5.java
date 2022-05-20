package package07;

interface Calculate {
	int cal(int n1, int n2);
}

class Calculeggo implements Calculate {
	@Override
	public int cal(int n1, int n2) {
		return n1 * n2;
	}	
}

public class Lambda_5 {
	public static void main(String[] args) {
		Calculate c = (int n1, int n2) -> {return n1 + n2;};
		System.out.println(c.cal(2, 1));
		
//		return문의 경우, 아무리 한 문장밖에 없더라도 중괄호 생략 불가.
		c = (n1, n2) -> {return n1 + n2;};
		System.out.println(c.cal(3, 1));
		
		c = (n1, n2) -> n1 + n2;
		System.out.println(c.cal(4, 1));
		
		c = (n1, n2) -> n1 * n2;
		System.out.println(c.cal(2, 3));
	}
}
