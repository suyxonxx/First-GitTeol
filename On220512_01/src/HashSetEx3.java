import java.util.*;

public class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person ("David", 10));
		set.add(new Person ("David", 10));
		
		System.out.println(set);
	} //end of main
} //end of public class

class Person {
	String name;
	int age;
	
	Person() {}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((name == ((Person)obj).name) && (age == ((Person)obj).age)) ? true : false;
	}
} //end of class Person
