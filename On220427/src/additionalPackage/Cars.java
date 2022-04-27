package additionalPackage;

public class Cars {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
		se.setColor("red");
		System.out.println("color : " + se.getColor());
		
		se.setPassenger(4);
		System.out.println("passenger : " + se.getPassenger());
		
		Sedan se2 = new Sedan("blue", 2, 4, 3);
		System.out.println("color : " + se2.getColor());
		System.out.println("passenger : " + se2.getPassenger());
		
		Sports sp = new Sports();
		sp.setColor("red");
		System.out.println(sp.getColor());
		
		Sports sp2 = new Sports("yellow", 2, 4, 1, 5000);
		System.out.println(sp2.getColor() + ", " + sp2.getPassenger() + ", "
		+ sp2.getTire() + ", " + sp2.getSeat() + ", " + sp2.getHorsepower());
	}
}

class Sports extends Sedan {
	int horsepower;
	
	public Sports() {}
	public Sports(String color, int passenger, int tire, int seat, int horsepower) {
		super(color, passenger, tire, seat);
		System.out.println("Sport() 생성자");
		this.horsepower = horsepower;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
}

class Sedan extends Car {
	private String color;
	
	public Sedan() {}
	public Sedan(String color, int passenger, int tire, int seat) {
		super(passenger, tire, seat); //상위클래스(Car) 생성자에게 전달
		System.out.println("Sedan() 생성자");
		this.color = color;
//		setPassenger(passenger);
//		setTire(tire);
//		setSeat(seat);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	void gas() {}
}

class Bus {
	int passengerCount;
	void passengerLoad() {}
}

class Truck {
	int load;
	void objectLoad() {}
}

class Car {
	private int passenger;
	private int tire;
	private int seat;
	
	public Car() {}
	public Car(int passenger, int tire, int seat) {
		System.out.println("Car() 생성자");
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	void run() {}
	void stop() {}
}
