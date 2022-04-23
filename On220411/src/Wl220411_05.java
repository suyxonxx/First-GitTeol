
public class Wl220411_05 {

	public static void main(String[] args) {
		
		abc : for (int i = 1; i <=100; i++) {
			System.out.printf("i = %d", i);
			
			int tmp = i;
			
			for (;;) {
				
				if (tmp%10 % 3==0 && tmp%10 != 0)
					System.out.println("짝");
				
				if ((tmp/=10) == 0)
					continue abc; //abc까지 다시 올라가라
			}//end of for;
			
//			def : for (int i2 = 1; i2 <= 100; i2++) {
//			System.out.printf("i2 = %d", i2);
//			
//			int tmp2 = i2;
//			
//			for (;;) {
//				
//				if (tmp2%10 % 3==0 && tmp2%10 != 0)
//					System.out.println("짝");
//				
//				if ((tmp2/=10) == 0)
//					break def; //아예 def도 벗어나라
//			}
			
		}
		
	}//end of main

}

