import java.util.*;

public class Wl220422_09 {

	public static void main(String[] args) {
		
//		주사위 2개를 던져서, 두 수의 합이 5가 되면 종료.
		{	System.out.println("-1-");
		
			int dice1, dice2;
			
			do {
				dice1 = (int)(Math.random() * 6 + 1);
				dice2 = (int)(Math.random() * 6 + 1);
				System.out.printf("(%d, %d)%n", dice1, dice2);
			} while (dice1 + dice2 != 5);
			
			System.out.println("Exit");
			
		}//end of block 1
		
		{	System.out.println(System.lineSeparator() + "-2-");
		
			Random rand = new Random();
			int dice1, dice2;
			
			do {
				dice1 = rand.nextInt(6);
				dice2 = rand.nextInt(6);
				System.out.printf("(%d, %d)%n", dice1 + 1, dice2 + 1);
			} while (dice1 + dice2 != 3);
			
			System.out.println("Exit");
			
		}//end of block 2
		
//		Made by others
		{	System.out.println(System.lineSeparator() + "-3-");
		
			while (true) {
				int dice1 = (int)(Math.random() * 6 + 1);
				int dice2 = (int)(Math.random() * 6 + 1);
				
				System.out.println("(" + dice1 + ", " + dice2 + ")");
				
				if(dice1 + dice2 == 5) break;
			}//end of while
			
		}//end of block 3
		
	}//end of main

}//end of class
