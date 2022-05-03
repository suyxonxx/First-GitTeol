package SamsungLG_2;

public class LGTV implements TV {
	@Override
	public void PowerOn() {
		System.out.println("LG TV >> Power On");
	}
	@Override
	public void PowerOff() {
		System.out.println("LG TV >> Power Off");
	}
	@Override
	public void volumeUp() {
		System.out.println("LG TV >> Volume Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("LG TV >> Volume Down");
	}
}
