
public class Wl220413_06 {

	public static void main(String[] args) {
////		-1-
//		int [] score = new int[5];
//		int k = 1;
//		
//		score [0] = 50;
//		score [1] = 60;
//		score [k+1] = 70;
//		score [3] = 80;
//		score [4] = 90;
//		
//		int tmp = score[k+2] + score[4];
//		
////		print all elements (ARRAY ONLY)
//		for (int i=0; i<5; i++)
//			System.out.printf("score[%d] : %d\n", i, score[i]);
//		
//		System.out.printf("tmp : %d\n", tmp);
////		System.out.printf("score[%d] : %d\n", 7, score[7]); //out of index range
		
//		-2-
		int [] score = new int[10];
		int k = 1;
		
		score [0] = 50;
		score [1] = 60;
		score [k+1] = 70;
		score [3] = 80;
		score [4] = 90;
		
		int tmp = score[k+2] + score[4];
		
		for (int i = 0; i < score.length; i++) //score.length 사용이 더욱 안정적.
			System.out.printf("score[%d] : %d\n", i, score[i]);
		
		System.out.printf("tmp : %d\n", tmp);
		System.out.printf("score[%d] : %d\n", 7, score[7]);
		
	}//end of main

}

