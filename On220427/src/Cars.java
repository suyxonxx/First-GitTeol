
public class Cars {
	public static void main(String[] args) {
		Sedan se = new Sedan("white", 5, 4);
//		se.color = "white";
//		se.passenger = 5;
//		se.tire = 4;
		System.out.println(se.color + ", " + se.passenger + ", " + se.tire);
		
		Bus bu = new Bus();
		bu.passenger = 15;
		bu.tire = 6;
		System.out.println(bu.passenger + ", " + bu.tire);
		
		SportsSedan ss = new SportsSedan(2, 4, 2, "Red", 1000);
		System.out.println(ss.color + ", " + ss.passenger + ", " + ss.tire + ", "
							+ ss.seat + ", " + ss.sports);
//		ss.finalize()
	}
}

class SportsSedan extends Sedan {
	int sports;
	
	public SportsSedan() {}
	
	public SportsSedan(int passenger, int tire, int seat, String color, int sports) {
		super(passenger, tire, seat, color);
		this.sports = sports;
	}
}

class Sedan extends CarType {
	String color;
	
	public Sedan() {}
	
	public Sedan(String color, int passenger, int tire) {
		super(passenger, tire, 4); //super를 통해 상위클래스 생성자 호출
		this.color = color;
//		passenger와 tire는 상위클래스에서 상속받은 것이므로, this 사용X
//		this.passenger = passenger;
//		this.tire = tire;
		System.out.println("Sedan() 생성자");
	}
	public Sedan(int passenger, int tire, int seat, String color) {
		super(passenger, tire, seat);
		this.color = color;
	}
}

class Bus extends CarType {
	void passengersLoad() {}
}

class Truck extends CarType {
	void objectLoad() {}
}

class CarType {
	int passenger;
	int tire;
	int seat;
	
	public CarType(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
		System.out.println("CarType() 생성자 1");
	}
	public CarType() {
		this(10, 4, 4);
		System.out.println("CarType() 생성자 2");
	}
	void run() {
		System.out.println("run()");
	}
	void stop() {}
}
