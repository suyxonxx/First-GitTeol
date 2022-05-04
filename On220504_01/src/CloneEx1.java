
class Point implements Cloneable {
	int x, y;
	
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}

public class CloneEx1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();
		Point copy2 = original;
		
		System.out.println("original : " + original);
		System.out.println("copy : " + copy);
		System.out.println("copy2 : " + copy2);
		System.out.println("--------------------------");
		
		original.x = 10;
		original.y = 20;
		copy.x = 100;
		copy.y = 200;
		
		System.out.println("original : " + original);
		System.out.println("copy : " + copy);
		System.out.println("copy2 : " + copy2);
	}
}
