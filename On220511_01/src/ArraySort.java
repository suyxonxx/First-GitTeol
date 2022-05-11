import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		Person per = new Person("손흥민", 31);
		
		System.out.println(per);
		System.out.println();
		
		Person[] person = new Person[3];
		
		person[0] = new Person("홍길동", 20);
		person[1] = new Person("홍길순", 40);
		person[2] = new Person("홍길영", 30);
		
		System.out.println(Arrays.toString(person));
		System.out.println();
		
		Arrays.sort(person);

		System.out.println("= After Arrays.sort(person) =");
		for(Person p : person)
			System.out.println(p);
	} //end of main
} //end of public class

class Person implements Comparable{
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Object o) {
//		= 1. 교재의 예시로 나와있으나, 없어보인다 함... =
//		if(this.age > p.age) return 1;
//		else if(this.age < p.age) return -1;
//		else return 0;
		
//		= 2. 간zi 그 자체 =
//		2-1. 오름차순
//		return this.age - p.age;
//		2-2.내림차순
		return ((Person)o).age - this.age;
	} //end of compareTo
} //end of class Person
