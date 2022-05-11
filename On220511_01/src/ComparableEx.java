import java.util.*;

class Point /*implements Comparable<Point>*/{
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x = " + x + ", y = " + y + "]";
	}
	/*
	@Override
	public int compareTo(Point o) {
		return this.x - o.x;
	}
	*/
} //end of class Point

class MySort implements Comparator<Point> {
	@Override
	public int compare(Point o1, Point o2) {
		return o1.y - o2.y;
	}
} //end of class MySort

public class ComparableEx {
	public static void main(String[] args) {
		List<Point> point = new ArrayList<Point>();
		
		point.add(new Point(10, 20));
		point.add(new Point(50, 10));
		point.add(new Point(30, 30));
		
//		Collections.sort(point);
		
		Collections.sort(point, new MySort());
		
		for(Point p : point)
			System.out.println(p);
	} //end of main
} //end of public class
