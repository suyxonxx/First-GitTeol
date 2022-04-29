package ezen01;

public class Exam02 {

	public static void main(String[] args) {
		
		animal2 animal = new Penguin2();
		
//		아래 주의!!! ∵ 동급 클래스라서 아래의 과정이 이루어질 수 없으나,
//		직접 실행하기 전에는 Error 여부를 확인할 수 없음
//		Person2 pen = (Person2)animal;
//		pen.eat();
		
//		위의 문제를 해결하기 위해 instanceof 연산자를 사용함(362 - 363p 참고)
		if(animal instanceof Birds2) {
			Birds2 birds = (Birds2)animal;
		}
		else if(animal instanceof Mammal2) {
			Mammal2 mammal = (Mammal2)animal;
		}
	}
}

class animal2 {
	void eat() {
		System.out.println("동물이 먹는다");
	}
}

class Mammal2 extends animal2 {
	void eat() {
		System.out.println("포유류가 먹는다");
	}
}

class Whale2 extends Mammal2 {
	void eat() {
		System.out.println("고래가 먹는다");
	}
}

class Person2 extends Mammal2 {
	void eat() {
		System.out.println("사람이 먹는다");
	}
}

class Birds2 extends animal2 {
	void eat() {
		System.out.println("조류가 먹는다");
	}
}

class Sparrow2 extends Birds2 {
	void eat() {
		System.out.println("참새가 먹는다");
	}
}

class Penguin2 extends Birds2 {
	void eat() {
		System.out.println("펭귄이 먹는다");
	}
}
