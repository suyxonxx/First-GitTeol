
public class Tv {
//	Tv의 속성
//	- 인스턴스 변수
	String color; //색상
	boolean power; //전원 상태 (on / off) ← 인스턴스 변수
	int channel; //채널
	
//	Tv의 기능
//	- 인스턴스 메소드
	void power()	{ power = !power; } //Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp()	{ ++channel; } //Tv의 채널을 높이는 기능을 하는 메서드
	void channelDown()	{ --channel; } //Tv의 채널을 낮추는 기능을 하는 메서드
}

class TvTest {
	public static void main(String[] args) {
//		Tv 객체를 만들고 싶음 → 이 때, 객체를 만들기 위해서 클래스(설계도)가 있어야 함
		
		Tv t; //Tv 인스턴스를 참조하기 위한 변수(참조변수) t를 선언
		t = new Tv(); //Tv 인스턴스 생성
//		위의 두 문장은 'Tv t = new Tv();'와 같음
		
		t.channel = 7; //Tv 인스턴스의 멤버변수 channel의 값을 7로 설정
		t.channelDown(); //Tv 인스턴스의 메서드 channelDown을 호출
		System.out.println("t - 현재 채널은 " + t.channel + "입니다.");
		
		Tv t2 = new Tv();
		t2.channel = 10;
		t2.channelUp();
		System.out.println("t2 - 현재 채널은 " + t2.channel + "입니다.");
		
		Tv t3 = t2; //t2와 같은 곳을 참조하는 상태가 됨
		System.out.println("t3 - 현재 채널은 " + t3.channel + "입니다.");
		
		Tv t4 = new Tv();
		t2 = t4;
		System.out.println("t2 - 현재 채널은 " + t2.channel + "입니다.");
		System.out.println("t4 - 현재 채널은 " + t4.channel + "입니다.");
	}
}
