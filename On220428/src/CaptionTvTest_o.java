class Tv2 {
	private boolean power;
	private int channel;
	
	int getChannel() {
		return channel;
	}
	boolean getPower() {
		return power;
	}
	
	public Tv2 () {
		this(false, 0);
	}
	public Tv2(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
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

class CaptionTv2 extends Tv2 {
	boolean caption;
	
	public CaptionTv2() {
		this(false, 0, false);
	}
	public CaptionTv2(int channel, boolean caption) {
		this(false, channel, caption);
	}
	public CaptionTv2(boolean power, int channel, boolean caption) {
		super(power, channel);
		this.caption = caption;
	}
	
	void displayCaption (String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest_o {

	public static void main(String[] args) {
		CaptionTv2 ctv2 = new CaptionTv2(10, false);
		ctv2.channelUp();
		System.out.println(ctv2.getChannel());
		ctv2.displayCaption("Hello, World!");
		ctv2.caption = true;
		ctv2.displayCaption("Hello, World!");
	}

}
