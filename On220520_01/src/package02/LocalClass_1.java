package package02;

interface Printable {
	void print(); //public void print()에서 public이 생략된 형태임.
}

class Papers {
	private String con;
	public Papers(String s) {con = s;}
	
	public Printable getPrinter() {
//		local class - method 내부에 선언된 class
		class Printer implements Printable {
			public void print() {
				System.out.println(con);
			}
		}
		
		return new Printer();
	} //end of getPrinter()
} //end of class Papers

public class LocalClass_1 {
	public static void main(String[] args) {
		Papers p = new Papers("message JAVA!!");
		Printable prn = p.getPrinter();
		prn.print();
		
		
		
		
	}
}
