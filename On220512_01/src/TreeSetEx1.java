import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		
		for(Integer n : tree)
			System.out.print(n.toString() + "  ");
//			아래처럼 써도 OK (아래의 while문도 마찬가지.)
//			System.out.print(n + "  ");
		System.out.println();
		
		Iterator<Integer> itr = tree.iterator();
		while(itr.hasNext()) {
			Integer n = itr.next();
			System.out.print(n.toString() + "  ");
		}
		System.out.println();
	}
}
