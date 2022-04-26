
public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.num++;
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		
		Car2 c10 = Car2.getInstance();
		c10.num++;
		System.out.println(c10.num);
		
		Car2 c11 = Car2.getInstance();
		c11.num++;
		System.out.println(c11.num);
		System.out.println(c10.num);
	}

}

class Car {
	int num = 10;
	public Car() {}
}

class Car2 {
	private static Car2 car2 = null; //외부에서의 접근을 막기 위해 private을 붙여준 것
	int num = 100; //인스턴스 변수
	
	private Car2 () {}
	
	public static Car2 getInstance() { //외부로 넘겨주기 위해 public을 붙여서 접근범위를 넓게 잡음
		if(car2 == null)
			car2 = new Car2(); //생성자 호출
		return car2;
	}
}
