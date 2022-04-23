
public class Wr220411_02 {

	public static void main(String[] args) {
		System.out.println("-1-");
		for (int i = 1; i <= 3; i++) 
			for (int j = 1; j <= 3; j++) 
				for (int k = 1; k <= 3; k++)
					System.out.println("" + i + j + k);
		
		System.out.println("\n-2-");
		int ii = 1, jj = 1, kk = 1;
		
		while (ii <= 3) {
			while (jj <= 3) {
				while (kk <= 3) {
					System.out.println("" + ii + jj + kk);
					kk++;
				}
				kk = 1;
				jj++;
			}
			jj = 1;
			ii++;
		}
		
	}//end of main
	
}

