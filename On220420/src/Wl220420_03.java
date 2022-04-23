import java.util.Arrays;

public class Wl220420_03 {

	public static void main(String[] args) {
		
		{//bubble sort
			int[] nArr = {30, 20, 50, 40, 10};
			
			for (int i = 0; i < nArr.length - 1; i++) {
				for (int j = i + 1; j < nArr.length; j++) {
					if (nArr[j] < nArr[i]) {
						int tmp = nArr[i];
						nArr[i] = nArr[j];
						nArr[j] = tmp;
					}
				}
			}
			System.out.println(Arrays.toString(nArr));
		}//end of block 1
		
		{//selection sort(선택 정렬)
			int[] nArr = {30, 20, 50, 40, 10};
			
			for (int i = 0; i < nArr.length - 1; i++) {
				int index = i;
				for (int j = i + 1; j < nArr.length; j++) {
					if (nArr[index] > nArr[j])
						index = j;
					}
				if (index != i) {
					int tmp = nArr[index];
					nArr[index] = nArr[i];
					nArr[i] = tmp;
				}
				System.out.println(i + "회전 > " + Arrays.toString(nArr));
			}
		}//end of block 2
	}//end of main
}
