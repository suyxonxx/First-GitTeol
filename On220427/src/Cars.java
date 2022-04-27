import lombok.ToString;

public class Cars {
	public static void main(String[] args) {
		Sedan se = new Sedan();
		se.color = "white";
		se.passenger = 5;
		se.tire = 4;
		System.out.println(se.color + ", " + se.passenger + ", " + se.tire);
		
		Bus bu = new Bus();
		bu.passenger = 15;
		bu.tire = 6;
		System.out.println(bu.passenger + ", " + bu.tire);
	}
}

@ToString
class CarType {
	int passenger;
	int tire;
	int seat;
	
	void run() {}
	void stop() {}
}

@ToString
class Sedan extends CarType {
	String color;
}

@ToString
class Bus extends CarType {
	void passengersLoad() {};
}

@ToString
class Truck extends CarType {
	void objectLoad() {};
}
