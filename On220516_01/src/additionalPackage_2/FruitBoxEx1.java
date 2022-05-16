package additionalPackage_2;
import java.util.*;

class Fruit {@Override public String toString() {return "Fruit";}}
class Apple extends Fruit {@Override public String toString() {return "Apple";}}
class Grape extends Fruit {@Override public String toString() {return "Grape";}}
class Toy {@Override public String toString() {return "Toy";}}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); //←error ∵type mismatch
	
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //←OK. ∵class Apple extends Fruit
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); //←error.
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); //←error.
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	} //end of main
} //end of public class

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get (int i) {return list.get(i);}
	int size() {return list.size();}
	@Override public String toString() {return list.toString();}
} //end of class Box
