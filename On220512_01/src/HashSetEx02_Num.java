import java.util.*;

class Num {
	private int num;
	public Num(int num) {this.num = num;}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 6;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Num)obj).num) return true;
		else return false;
	}
}

public class HashSetEx02_Num {
	public static void main(String[] args) {
//		HashSet - 중복 X, 순서 X
		HashSet<Num> set = new HashSet<Num>();
		
		set.add(new Num(1));
		set.add(new Num(5));
		set.add(new Num(2));
		set.add(new Num(5));
		set.add(new Num(3));
		
		System.out.println("count : " + set.size());
		
//		-1. for문-
		for(Iterator<Num> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();
		
//		-2. 향상된 for문-
		for(Num s : set) {
			System.out.print(s + "  ");
		}
	} //end of main
}
