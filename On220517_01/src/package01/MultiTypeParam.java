package package01;

/*
 * <일반적인 용례>
 * E : Element
 * K : Key
 * N : Number
 * T : Type
 * V : Value
*/

class DBox<L, R> {
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
} //end of class DBox

public class MultiTypeParam {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("Apple", 20);
		System.out.println(box);
		
		box.set("Apple2", new Integer(50));
		System.out.println(box);
	} //end of main
} //end of public class
