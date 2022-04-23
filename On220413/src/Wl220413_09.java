import java.util.*;

public class Wl220413_09 {

	public static void main(String[] args) {
		
//		double 10개 받아서 20개로 확장하기
		double[] dArr1 = new double[10];
		double [] tmp = new double[dArr1.length * 2];
		
		for(int i = 0; i < dArr1.length; i++)
			dArr1 [i] = Math.random();
		
		System.out.println(Arrays.toString(dArr1));
		
		for(int i = 0; i < dArr1.length; i++)
			System.out.printf("%.2f\n", dArr1[i]);

		for(int i = 0; i < dArr1.length; i++)
			tmp[i] = dArr1[i];

		dArr1 = tmp;
		
		System.out.println("\n" + Arrays.toString(dArr1));
		
		for(int i = 0; i < dArr1.length; i++)
			System.out.printf("%.2f\n", dArr1[i]);
		
	}

}

