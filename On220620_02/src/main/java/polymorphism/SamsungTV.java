package polymorphism;

public class SamsungTV implements TV{
//	public void powerOn() {
//		System.out.println("SamsungTV---전원 켠다.");
//	}
//	public void powerOff() {
//		System.out.println("SamsungTV---전원 끈다.");
//	}
//	public void VolumeUp() {
//		System.out.println("SamsungTV---소리 올린다.");
//	}
//	public void VolumeDown() {
//		System.out.println("SamsungTV---소리 내린다.");
//	}
	
	public SamsungTV() {
		System.out.println("samsungTV 생성자");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	@Override
	public void VolumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}
	@Override
	public void VolumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
	}
}
