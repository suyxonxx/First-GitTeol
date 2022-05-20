package package06;

interface Printable3 {void print(String s);}

public class Lambda_3 {
	public static void main(String[] args) {
		Printable3 prn = (s) -> System.out.println(s);
		prn.print("LAMDAAAAA");
	}
}
