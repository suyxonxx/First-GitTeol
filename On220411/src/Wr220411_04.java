
public class Wr220411_04 {

	public static void main(String[] args) {
		System.out.println("-1-");
		int i1 = 1;
		for (; i1 <= 10; i1++) {
			if (i1 % 3 != 0)
				System.out.println(i1);
		}
		
		System.out.println("\n-2-");
		int i = 2;
		int j = 1;
		Loop1 : for(; i <= 9; i++) {//forA
					for (; j <=9; j++) {//forB
						if (j == 5)
//							break;
//							break Loop1;
//							continue; //←얘만 결과가 다르게 나옴.
							continue Loop1;
					System.out.printf("%d × %d = %d\n",i,j,(i*j));
			}//end of forB
		}//end of Loop1
	}//end of main
}

