import java.util.Arrays;

public class Wr220417_03 {

	public static void main(String[] args) {
		
//		배열 복붙
		int[] iArr = new int [5];
		int [] tmp = new int [iArr.length * 2];
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random() * 99 + 1);
		}
		
		System.out.println(Arrays.toString(iArr));
		
		for (int i = 0; i < iArr.length; i++) {
			tmp[i] = iArr[i];
		}
		
		System.out.println(Arrays.toString(tmp));
		
		iArr = tmp;
		
		System.out.println(Arrays.toString(iArr));
		
	}//end of main
	
}

