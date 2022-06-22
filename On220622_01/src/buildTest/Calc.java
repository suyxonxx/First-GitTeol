package buildTest;

public class Calc {
	int num1, num2;
	
	public Calc() {
		this(1, 1);
	}
	
	public Calc(int x, int y) {
		num1 = x;
		num2 = y;
	}
	
	int add() {return num1 + num2;}
	int sub() {return num1 - num2;}
	int mul() {return num1 * num2;}
	double div() {return (double) num1 / num2;}
	
	public void getInfo() {
		System.out.printf("두 정수 : %d, %d%n", num1, num2);
		System.out.printf("%d + %d = %d%n", num1, num2, add());
		System.out.printf("%d - %d = %d%n", num1, num2, sub());
		System.out.printf("%d × %d = %d%n", num1, num2, mul());
		System.out.printf("%d ÷ %d = %.2f%n", num1, num2, div());
	} 
}
