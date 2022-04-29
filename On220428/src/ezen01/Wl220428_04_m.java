package ezen01;

public class Wl220428_04_m {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	} //end of main
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열에 사용
	
	void buy(Product p) {
		if(p.price > money) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
		} else {
			money -= p.price;
			add(p);
		}
	} //end of buy
	
	void add(Product p) {
		Buyer ba = new Buyer();
		if(i >= ba.cart.length) {
			Product[] bigCart = new Product[ba.cart.length * 2];
				System.arraycopy(cart, 0, bigCart, 0, cart.length);
			cart = bigCart;
		}
			cart[i] = p;
			i++;
	} //end of add
	
	void summary() {
		int sum = 0;
		System.out.print("구입한 물건 : ");
		for(i = 0; i < cart.length; i++) {
			sum += cart[i].price;
			System.out.print(cart[i] + ", ");
		} System.out.println();
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
	} //end of summary
}

class Product {
	int price;
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}

class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}
