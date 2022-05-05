package AdditionalPackage;

public class Wl220505_06 {

	public static void main(String[] args) {
		Shape shape = new Circle(new Point(10, 10), 10);
		System.out.println(shape.calcArea());
		
		shape = new Rectangle(new Point(10, 10), 10.2, 10.3);
		System.out.println(shape.calcArea());
	}
}

class Circle extends Shape {
	int x = 200;
	double r;
	
	public Circle() {}
	public Circle(Point p, double r) {
		super(p); this.r = r;
	}
	
	@Override
	double calcArea() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		return r * r * Math.PI;
	}
} //end of class Circle

class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle() {}
	public Rectangle(Point p, double w, double h) {
		super(p); width = w; height = h;
	}
	
	boolean isSquare() {
		if(width == height) return true;
		return false;
	}
	
	@Override
	double calcArea() {
		return width * height;
	}
} //end of class Rectangle

abstract class Shape {
	int x = 100;
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
} //end of class Shape

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
	   return "[" + x + "," + y + "]";
	}
}// end of class Point
