package package04;

interface Printable {
	void print(); //public void print()에서 public이 생략된 형태임.
}

class Papers {
	private String con;
	public Papers(String s) {con = s;}
	
	public Printable getPrinter() {
		return new Printable() { //익명 클래스의 정의와 인스턴스 생성
			@Override
			public void print() {
				System.out.println(con);
			}
		};
	} //end of getPrinter()
} //end of class Papers

public class AnonymousClass_1 {
	public static void main(String[] args) {
		Papers p = new Papers("message JAVA!!");
		Printable prn = p.getPrinter();
		prn.print();
	}
}
