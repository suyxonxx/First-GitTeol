
public class Wl220419_01 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		for(int i = 0; i < 6; i++) {
			int j = (int)(Math.random() * 45);
			int temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
			System.out.printf("ball[%d] : %d%n", i, ball[i]);
		}
		
	}//end of main
	
}
