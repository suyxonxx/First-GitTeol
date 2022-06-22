package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTV implements TV{
	@Autowired
	@Qualifier("sonys")
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("samsungTV 생성자(매개변수 X)");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("samsungTV 생성자(매개변수 1개)");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("samsungTV 생성자(매개변수 2개)");
		this.speaker = speaker;
		this.price = price;
	}
	
//	void initMethod() { //초기화 메서드
//		System.out.println("initMethod 실행");
//	}
//	void destroyMethod() { //종료 메서드
//		System.out.println("destroyMethod 실행");
//	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
		System.out.println("가격 : " + price + "원");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	@Override
	public void VolumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	@Override
	public void VolumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
