package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonyTV implements TV{
	public SonyTV() {
		System.out.println("SonyTV 생성자");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SonyTV---전원 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("SonyTV---전원 끈다.");
	}
	@Override
	public void VolumeUp() {
		System.out.println("SonyTV---소리 올린다.");
	}
	@Override
	public void VolumeDown() {
		System.out.println("SonyTV---소리 내린다.");
	}
}
