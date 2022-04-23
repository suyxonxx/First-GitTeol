
public class Wl220419_07 {

	public static void main(String[] args) {
		
		{
			System.out.println("-1-");
			int[][] score = {
								{100, 100, 100}, 
								{20, 20, 20},
								{30, 30, 30},
								{40, 40, 40}
							};
			
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[0].length; j++)
					System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
			}
			System.out.println("");
			
			int sum = 0;
			
			for(int[] tmp : score) {
				int j = 0;
				for(int i : tmp) {
					sum += i;
					System.out.printf("%3d\t", tmp[j++]);
				}
				System.out.println("");
			}
			System.out.println("sum = " + sum);
		}//end of -1-
		
		{
			System.out.println("\n-2-");
			int[][] score = {
								{100, 100, 100}, 
								{20, 20, 20, 20},
								{40, 40, 40, 40, 40},
								{50, 50, 50, 50, 50, 50}
							};
			
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++)
					System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
			}
			System.out.println("");
		}//end of -2-
		
	}//end of main

}
