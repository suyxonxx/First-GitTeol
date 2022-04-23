
public class Wl220421_06 {
	
//	Made by me
	public static void main(String[] args) {
//		두 배열의 요소가 같으면 true, 다르면 false 출력
		int[] nArr1 = {10, 20, 3, 40, 50};
		int[] nArr2 = {10, 20, 3, 40, 50};
		
		ArrayEqual(nArr1, nArr2);
	}//end of main
	
//	두 배열의 비교는 아래 함수에서 할 것.
	static void ArrayEqual(int[] arr1, int[] arr2) {
		
		boolean flag = true;
		
		for (int i = 0; i < 5; i++) {
			if (arr1[i] != arr2[i]) {
				flag = false;
			}
		}
		System.out.println(flag);
	}//end of ArrayEqual

}//end of class
