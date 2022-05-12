import java.util.*;
class Person2 implements Comparable<Person2>{
	String name;
	int age;
	
	Person2() {}
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[" + name + " : " + age + "]";
	}
	
	@Override
	public int compareTo(Person2 o) {
		return this.age - o.age;
	}
} //end of class Person2
	
public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet<Person2> tree = new TreeSet<Person2>();
		
		tree.add(new Person2("Kim", 20));
		tree.add(new Person2("Park", 50));
		tree.add(new Person2("Lee", 80));
		tree.add(new Person2("Lee", 80));
		tree.add(new Person2("Lee", 50));
		tree.add(new Person2("Kim", 29));
		tree.add(new Person2("Kim", 80));
		
		for(Person2 n : tree)
			System.out.print(n + "  ");
		System.out.println();
		
		Iterator<Person2> itr = tree.iterator();
		while(itr.hasNext()) {
			Person2 n = itr.next();
			System.out.print(n + "  ");
		}
		System.out.println();
	} //end of main
} //end of public class
