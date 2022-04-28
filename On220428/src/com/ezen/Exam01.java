package com.ezen;

public class Exam01 {

	public static void main(String[] args) {
		animal an1 = new animal();
		animal an2 = new Mammal();
		animal an3 = new Person();
		
//		참조중인 class로부터 overriding이 가능한 method이기 때문에 정상적으로 불러와서 실행 가능
		an1.eat();
		an2.eat();
		an3.eat();
//		위와 같은 이유로 당연히 가능
		Mammal ma = new Person();
		ma.eat();

//		overriding이 불가능한 method는 X	
//		an3.run();
		
//		동급의 클래스끼리는 애초에 객체 생성부터 불가능
//		Whale wh = new Person();
//		wh.eat();
		
		Object obj = new Person(); //Object class의 참조 변수를 통한 객체 생성은 가능하나
//		obj.eat(); //←얘는 안됨 ∵Object class에는 eat method가 없기 때문
		System.out.println("------------");
//		참조변수의 형변환(356 ~ 361p 참고)
//		Person p = an3; //←이렇게 쓰는 건 안됨.
		Person p = (Person)an3;
		
//		멀쩡하게 잘 찍히는 걸 확인할 수 있음.
		p.eat();
		p.run();
		
//		Person p2 = obj; //←위의 'Person p = an3;'가 안되는 것과 마찬가지로 안됨.
		Person p2 = (Person)obj;
		Person p3 = p2;
	}
}

class animal {
	void eat() {
		System.out.println("동물이 먹는다");
	}
}

class Mammal extends animal {
	void eat() {
		System.out.println("포유류가 먹는다");
	}
}

class Whale extends Mammal {
	void eat() {
		System.out.println("고래가 먹는다");
	}
}

class Person extends Mammal {
	void eat() {
		System.out.println("사람이 먹는다");
	}
	void run() {
		System.out.println("사람이 달린다");
	}
}

class Birds extends animal {
	void eat() {
		System.out.println("조류가 먹는다");
	}
}

class Sparrow extends Birds {
	void eat() {
		System.out.println("참새가 먹는다");
	}
}

class Penguin extends Birds {
	void eat() {
		System.out.println("펭귄이 먹는다");
	}
}
