package SamsungLG_2;

public class SamsungTV implements TV {
	@Override
	public void PowerOn() {
		System.out.println("Samsung TV >> Power On");
	}
	@Override
	public void PowerOff() {
		System.out.println("Samsung TV >> Power Off");
	}
	@Override
	public void volumeUp() {
		System.out.println("Samsung TV >> Volume Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("Samsung TV >> Volume Down");
	}
}
