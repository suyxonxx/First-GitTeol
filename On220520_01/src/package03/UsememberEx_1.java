package package03;

import java.util.*;

interface Printable {
	void print(); //public void print()에서 public이 생략된 형태임.
}

class Papers {
	private String con;
	public Papers(String s) {con = s;}
	public Printable getPrinter() {return new Printer2();}
	
	private class Printer1 implements Printable {
		@Override
		public void print() { //이 경우에는 public 생략 불가.
			System.out.println("흑백 : " + con);
		}
	}
	private class Printer2 implements Printable {
		@Override
		public void print() { //이 경우에는 public 생략 불가.
			System.out.println("칼라 : " + con);
		}
	}
}

public class UsememberEx_1 {
	public static void main(String[] args) {
		Papers p = new Papers("message JAVA!!");
		Printable prn = p.getPrinter();
		prn.print();
		
		List<String> list = new ArrayList<>();
		list.add("Aa");
		list.add("Bb");
		list.add("Cc");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {System.out.print(it.next() + " ");}
		
		
	}
}
