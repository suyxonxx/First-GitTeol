
class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int prevChannel;
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
}

public class Exercise7_10_11_o {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		
		t.setVolume(20);
		System.out.println("Vol : " + t.getVolume());
	}
}
