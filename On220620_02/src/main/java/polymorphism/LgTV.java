package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV{
//	@Autowired
//	@Qualifier("apples")
	@Resource(name="apples")
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("LgTV 생성자(매개변수 X)");
	}
	public LgTV(Speaker speaker) {
		System.out.println("LgTV 생성자(매개변수 1개)");
		this.speaker = speaker;
	}
	public LgTV(Speaker speaker, int price) {
		System.out.println("LgTV 생성자(매개변수 2개)");
		this.speaker = speaker;
		this.price = price;
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
		System.out.println("가격 : " + price + "원");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	@Override
	public void VolumeUp() {
//		System.out.println("LgTV---소리 올린다.");
		speaker.volumeUp();
	}
	@Override
	public void VolumeDown() {
//		System.out.println("LgTV---소리 내린다.");
		speaker.volumeDown();
	}
}
