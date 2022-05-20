package package06;

interface Printable2 {void print(String s);}

class Printer2 implements Printable2 {
	@Override
	public void print(String s) {System.out.println(s);}
}

public class Lambda_2 {
	public static void main(String[] args) {
		Printable2 prn = new Printable2() {
			public void print(String s) {
				System.out.println(s);
			}
		};
		prn.print("LAMDAAAAA");
	}
}
