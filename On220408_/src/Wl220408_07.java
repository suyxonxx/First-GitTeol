
public class Wl220408_07 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		for (int i=0; i<5; i++) { //행, 줄
			
			for (int j=0; j<5; j++) //열, 칸
				System.out.print("*");
			
			System.out.println(""); //줄바꿈
			}

		System.out.println("\n-2-");
		for (int i=1; i<3; i++) {
			
			for (int j=1; j<4; j++)
				System.out.print(i * j);
			
			System.out.println("");
			}
		
		System.out.println("\n-3-");
		System.out.println("2단\t\t3단\t\t4단\t\t5단\t\t6단\t\t7단\t\t8단\t\t9단\n"
		+ "-------------------------------------------------------------"
		+ "-------------------------------------------------------------");
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.print(j + " × "+ i + " = " + (i * j) + "\t");
				}
			System.out.println("");
			}

		System.out.println("\n-4-");
		int j;
		for (int i=2; i<=9; i++) {
			for (j=1; j<=i; j++) { //←왜 이생각을 못했지????????
				System.out.print(i + " × "+ j + " = " + (i * j) + "\n");
				}
			System.out.println("");
			}

		System.out.println("\n-4-");
		for (int ii = 1; ii <= 10; ii++) {
			for (int kk = 1; kk <= ii; kk++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		
	} //main end

}

