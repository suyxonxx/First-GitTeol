import java.io.*;
import java.util.*;

public class Wl220418_01 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		int i = 0;
		
		{
			File file = new File("Data/data.txt");//파일을 불러옴
			FileInputStream src = new FileInputStream(file);//파일의 정보를 읽어와서 메모리에 올려둠
			Scanner sc = new Scanner(src);
			
			while(sc.hasNext()) {
				String tmp = sc.next();
				System.out.printf("%s, ", tmp);
				i++;
			}
			sc.close();
			src.close();
		}
		
		System.out.println("i : " + i);
		
		int[] nums = new int[i];
		
		{//배열 공간에 data1.txt 넣기
			File file = new File("Data/data.txt");//파일을 불러옴
			FileInputStream src = new FileInputStream(file);//파일의 정보를 읽어와서 메모리에 올려둠
			Scanner sc = new Scanner(src);
			for (int j = 0; j < i; j++) {
				String tmp = sc.next();
				nums[j] = Integer.parseInt(tmp);
			}
			System.out.println("nums : " + Arrays.toString(nums));
			sc.close();
			src.close();
		}
		
		{//배열에서 특정 숫자를 찾기,88은 몇번째에 있는지 출력
			int index = 0;
			for(int j = 0; j < i; j++)
				if(88 == nums[j]) {
					index = j;
					break;
			}
			System.out.println("위치 : " + index);
		}
		
		{//index 위치 변경 0 ↔ 5의 위치 교환하기.
			int tmp = nums[0];
			nums[0] = nums[5];
			nums[5] = tmp;
			System.out.println("nums_0 ↔ 5 : " + Arrays.toString(nums));
		}
		
		{//반복적으로 i ↔ i + 1을 교환
			for (int j = 0; j < i - 1; j++) {
				int tmp = nums[j + 1];
				nums[j + 1] = nums[j];
				nums[j] = tmp;
			
				Thread.sleep(1000);//1000을 입력 : 1초 만큼 딜레이.
				
				for (int k = 0; k < 50; k++)
					System.out.println();
				
				for (int k = 0; k < i; k++) {
					if (k == j + 1)
						System.out.printf("[%d] ", nums[k]);
					else
						System.out.printf("%d ", nums[k]);
				}
			}
			Thread.sleep(1000);
			System.out.println(System.lineSeparator() + "nums_i ↔ i + 1 : " + Arrays.toString(nums));
		}
	}//end of main
}
