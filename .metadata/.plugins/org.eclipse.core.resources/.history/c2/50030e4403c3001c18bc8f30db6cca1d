import java.util.*;
import java.io.*;

public class Wl220422_01 {
										// ▼ 아래 의미 : 아몰랑 알아서해랑
	public static void main(String[] args) throws IOException {
		
		int count = 0;
		
		{//-1-
			File file = new File ("Data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(infile);
			
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}//end of while
			count--; //맨 윗줄은 유효 데이터가 아니므로, count를 1회 제외.
			System.out.println("count : " + count);
			
			infile.close();
			sc.close();
		}//end of block 1
		
		String[] region = new String[count];
		String[] city = new String[count];
		String[] district = new String[count];
		String[] dong = new String[count];
		int[] species_num = new int[count];
		int[] animal_num = new int[count];
		int[] owner_num = new int[count];
		String[] office_name = new String[count];
		String[] office_phonenum = new String[count];
		String[] data_date = new String[count];
		
		{//-2-
			File file = new File ("Data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(infile);
			
			sc.nextLine();//첫째줄을 읽어서 바로 버린다는 의미.
			
			int total = 0;
			
			for(int i = 0; i < count; i++) {
				String line = sc.nextLine();
				
				String[] tokens = line.split(",");//<--구분자는 ','임!!
				region[i] = tokens[0];
				city[i] = tokens[1];
				district[i] = tokens[2];
				dong[i] = tokens[3];
				species_num[i] = Integer.parseInt(tokens[4]);
				total += species_num[i];
//				System.out.println(Arrays.toString(tokens));
			}
			
			for(int i = 0; i < count; i++) {
				System.out.printf("%s %s %s %s %d%n"
				, region[i], city[i], district[i], dong[i], species_num[i]);
			}

			infile.close();
			sc.close();
		}//end of block 2
		
	}//end of main

}//end of class
