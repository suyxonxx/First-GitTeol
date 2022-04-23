import java.util.Arrays;

public class Wr220413_02 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		for(int i = 0; i < num.length; i++)
			num[i] = (int)(Math.random() * 99) + 1;
		
		System.out.println(Arrays.toString(num));
		
		sortUp(num);
		
	}
	
	public static void sortUp(int[] num) {
		
		for (int i = 0; i < num.length - 1; i++)
			for (int j = i + 1; j < num.length; j++)
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp; }
		
		System.out.println(Arrays.toString(num));
		
		sortDown(num);
		
	}
	
	public static void sortDown(int[] num) {
		
		for (int i = 0; i < num.length - 1; i++)
			for (int j = i + 1; j < num.length; j++)
				if (num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp; }
		
		System.out.println(Arrays.toString(num));
		
	}

}

