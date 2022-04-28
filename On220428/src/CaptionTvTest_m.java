class Tv {
	private boolean power;
	private int channel;
	
	public Tv () {}
	public Tv(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
	}
	
	public boolean getPower() {
		return power;
	}
	public int getChannel() {
		return channel;
	}
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv {
	private boolean caption;
	
	public CaptionTv() {}
	public CaptionTv(boolean power, int channel, boolean caption) {
		super(power, channel);
		this.caption = caption;
	}
	
	void caption() {
		caption = !caption;
	}
	
	void displayCaption (String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest_m {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv(false, 10, false);
		ctv.channelUp();
		System.out.println(ctv.getChannel());
		ctv.displayCaption("Hello, World!");
		ctv.caption();
		ctv.displayCaption("Hello, World!");
	}
}
