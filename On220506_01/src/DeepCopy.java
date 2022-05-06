
public class DeepCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle org = new Rectangle(1, 1, 8, 8);
		Rectangle cpy;
		cpy = (Rectangle)org.clone();
		
		org.showPosition();
		cpy.showPosition();
		
		org.changePos(3, 3, 7, 7);
		
		org.showPosition();
		cpy.showPosition();
	}
}

class Rectangle implements Cloneable {
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Rectangle copy = (Rectangle) super.clone();
		
		copy.upperLeft = (Point) upperLeft.clone();
		copy.lowerRight = (Point) lowerRight.clone();
		
		return copy;
	}
	
	public void showPosition() {
		System.out.println("좌측 상단");
		upperLeft.ShowPosition();
		
		System.out.println("우측 하단");
		lowerRight.ShowPosition();
	}
} //end of class Rectangle

class Point implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;	yPos = y;
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void ShowPosition() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
} //end of class Point
