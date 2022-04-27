//싱글톤(Single Tone)
public class CarTest3_re {
	
	public static void main(String[] args) {
		Car c1 = new Car(); //c1이라는 참조변수를 통해 Car 인스턴스 생성
		Car c2 = new Car(); //c2이라는 참조변수를 통해 Car 인스턴스 생성
		Car c3 = new Car(); //c3이라는 참조변수를 통해 Car 인스턴스 생성
		c1.num++; //c1이 참조하는 공간의 num값만 1 증가(10 + 1)
		System.out.println(c1.num); //11
		System.out.println(c2.num); //10
		System.out.println(c3.num); //10
		
		Car2 c10 = Car2.getInstance(); // c10이라는 참조변수를 통해
//											Car2의 클래스메서드인 getInstance() 호출
//											이를 통해, car2와 참조공간을 공유하게 됨(아래 설명 참고)
		c10.num++; //car2와 c10이 공유하는 참조공간의 num값(=100)에 1을 더함
		System.out.println(c10.num); //101
		
		Car2 c11 = Car2.getInstance(); // 위와 같은 과정. 이 과정을 통해 car2, c10, c11이
//											같은 참조공간을 공유하게 됨
		c11.num++; //이들이 공유하는 참조공간의 num값(=101)에 1을 더함
		System.out.println(c11.num); //102
		System.out.println(c10.num); //102
	}
} 

class Car {
	int num = 10; //Car의 인스턴스 변수 num을 선언 후 10으로 초기화
	public Car() {} //Car의 default 생성자
}

class Car2 {
//	car2가 static으로 설정된 이유 : 아래의 static method인 getInstance가 접근할 수 있도록 하기 위해.
	private static Car2 car2 = null; //Car2(이자 Car2 속성)의 클래스 변수 car2를 선언 후
//										null로 초기화. 참고로, 외부(타 클래스)의 접근을 막기 위해
//										private로 설정된 것.
	int num = 100; //Car2의 인스턴스 변수 num을 선언 후 100으로 초기화
	private Car2() {} //Car2의 default 생성자
	
	public static Car2 getInstance() { //광범위하게(타 클래스에서도) 접근할 수 있도록 public으로 설정
//										+ 객체 생성이 geInstance method 내부에서 이루어져야하므로
//											객체 생성이 선행되지 않아도 접근 가능한 static으로 설정
//		아래의 if문 사용 이유 : car2가 초기값인 null일 때만 if문을 통해 객체 생성 과정을 실행하고,
//							이후에는 빠져나와서 car2의 주소값을 반환하도록 구조화.
		if(car2 == null)
			car2 = new Car2(); //클래스 간을 자유롭게 오갈 수 있는 car2를 통해 Car2 인스턴스를 생성하여
		return car2; //주소값을 return하여 줌
	}
 }

//	<선생님 설명>
//1. 일반적으로 객체 생성할때 생성자 통해서 객체 생성한다.
//2. 싱글톤은 생성자 private >> 외부접근 금지
//3. 어떻게 접근할 것인가?? ==> getInstance메소드에서 객체를 생성하고 있다.
//4. 외부에서 객체를 생성하려면 getInstance통해서만 가능하다...
//5. getInstance도 메소드이기 때문에 외부에서 접근하려면 객체를 생성하고 접근해야한다.
//6. static메소드는 객체를 생성하지 않고서도 접근 가능하다. 따라서 getInstance를 static 메소드로 변경한다.
//7.  getInstance static 메소드에서 객체를 생성해서 참조변수 car2에게 생성된 객체 주소값을 넘겨준다.
//8. Car2 car2이 아이는 어떻게 설정해야하는가?  ==> static으로 static 변수(클래스변수로 설정)