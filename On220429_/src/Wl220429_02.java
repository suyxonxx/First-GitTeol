
public class Wl220429_02 {
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i].calcArea();
		return sum;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면적의 합: " + sumArea(arr));
		
//		이건 그냥 내가 출력시켜보고 싶었음
		System.out.println(((Rectangle)arr[1]).isSquare());
		
		Shape s1 = new Circle(new Point(10, 10), 10);
		System.out.println("중심 좌표: " + s1.p + "  넓이: " + s1.calcArea());
		
		Shape s2 = new Rectangle(150, 50);
		System.out.println("넓이: " + s2.calcArea());
		
	} //end of main
} //end of public class

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); //도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
} //end of Shape class

class Circle extends Shape {
	double r;
	
	Circle() {
		this(new Point(0, 0), 0);
	}
	Circle(double r) {
		this(new Point(0, 0), r);
	}
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
} //end of Circle class

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle() {
		this(new Point(0, 0), 0, 0);
	}
	Rectangle (double width, double height) {
		this(new Point(0, 0), width, height);
	}
	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		return (width == height && width * height != 0) ? true : false;
	}
} //end of Rectangle class

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
} //end of Point class
