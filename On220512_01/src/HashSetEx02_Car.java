import java.util.*;

class Car {
	private String model;
	private String color;
	private int price;
	
	public Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "["+ model + ", " + color + ", " + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, color, price);
	}
	
	@Override
	public boolean equals(Object obj) {
//		1. Made by me
//		if(model.equals(((Car)obj).model) && color.equals(((Car)obj).color) && price == ((Car)obj).price)
//			return true;
//		else return false;
		
//		2.Made by others
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		int p = ((Car)obj).price;
		
//		2-1. if문 이용
//		if(model.equals(m) && color.equals(c) && price == p) return true;
//		else return false;
//		2-2. 삼항연산자 이용
		return (model.equals(m) && color.equals(c) && price == p) ? true : false;
	}
}

public class HashSetEx02_Car {
	public static void main(String[] args) {
//		HashSet - 중복 X, 순서 X
		HashSet<Car> set = new HashSet<Car>();
		
		set.add(new Car("Y201", "red", 100));
		set.add(new Car("Y202", "black", 200));
		set.add(new Car("Y201", "red", 300));
		set.add(new Car("Y201", "white", 400));
		set.add(new Car("Y203", "black", 500));
		
		System.out.println("count : " + set.size());
		
//		-1. for문-
		for(Iterator<Car> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "  ");
		}
		System.out.println();
		
//		-2. 향상된 for문-
		for(Car s : set) {
			System.out.print(s + "  ");
		}
	} //end of main
}
