package package06;

interface Printable4 {void print(String s);}

interface Calculate {
	void cal(int n1, int n2);
}

class Cal implements Calculate {
	@Override
	public void cal(int n1, int n2) {
		System.out.println(n1 + n2);
	}
}

public class Lambda_4 {
	public static void main(String[] args) {
		Printable4 prn;
		
		prn = (String s) -> {System.out.println(s);};
		prn.print("LAMDA");
		
		prn = (String s) -> {System.out.println(s);};
		prn.print("LAMDAA");
		
		prn = (String s) -> {System.out.println(s);};
		prn.print("LAMDAAA");
		
		prn = (String s) -> {System.out.println(s);};
		prn.print("LAMDAAAA");
		
		Calculate c = new Cal();
		c.cal(8, 7);
		
		c = (int n1, int n2) -> {System.out.println(n1 + n2);};
		c.cal(6, 5);
		
		c = (n1, n2) -> {System.out.println(n1 * n2);};
		c.cal(4, 3);
		
		c = (n1, n2) -> {System.out.println(n1 - n2);};
		c.cal(20, 10);
	}
}
