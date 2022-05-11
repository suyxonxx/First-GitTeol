import java.util.Arrays;

public class ArraySortRe {
	public static void main(String[] args) {
		PersonRe[] PersonRe = new PersonRe[3];
		
		PersonRe[0] = new PersonRe("남궁", 20);
		PersonRe[1] = new PersonRe("신궁남궁", 40);
		PersonRe[2] = new PersonRe("궁남궁", 30);
		
		System.out.println(Arrays.toString(PersonRe));
		System.out.println();
		
		Arrays.sort(PersonRe);

		System.out.println("= After Arrays.sort(PersonRe) =");
		for(PersonRe p : PersonRe)
			System.out.println(p);
	} //end of main
} //end of public class

class PersonRe implements Comparable{
	private String name;
	private int age;
	
	public PersonRe() {}
	public PersonRe(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PersonRe [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Object o) {
//		1. 글자수 오름차순
		return this.name.length() - ((PersonRe)o).name.length();
//		2. 글자수 내림차순
//		return p.name.length() - this.name.length();
	} //end of compareTo
} //end of class PersonRe
