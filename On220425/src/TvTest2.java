
public class TvTest2 {

	public static void main(String[] args) {
		Tv2[] tvArr = new Tv2[3];
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv2();
			tvArr[i].channel = i + 10;
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
		}
		
	}//end of main
	
}

class Tv2 {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp () {
		++channel;
	}
	void channelDown () {
		--channel;
	}
}