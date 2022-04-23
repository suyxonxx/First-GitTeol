
public class Wl220412_08 {

	public static void main(String[] args) {
		
		int n1, n2;
		n1 = 10;
		n2 = 20;
		
		System.out.println("before" + n1 + ", " + n2);

		
		swap(n1, n2); //두 수 교환
		System.out.println("after" + n1 + ", " + n2);
		
	}

	public static void swap (int n1, int n2) {
		int tmp;
		tmp = n1;
		n1 = n2;
		n2 = tmp;
		
		System.out.println("after" + n1 + ", " + n2);
	}
}

