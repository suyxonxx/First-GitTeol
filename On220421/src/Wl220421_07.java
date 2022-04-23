
public class Wl220421_07 {

//	Made by others
	public static void main(String[] args) {

		int[] nArr1 = {10, 20, 3, 40, 50};
		int[] nArr2 = {10, 20, 3, 40, 50};
		
		boolean check = ArrayEqual(nArr1, nArr2);
		
		System.out.println("nArr1 : ");
		for(int i : nArr1)
			System.out.print(i + " ");
		System.out.println();

		System.out.println("nArr2 : ");
		for(int i : nArr2)
			System.out.print(i + " ");
		
		System.out.println("\n두 요소는 " + check);
	}//end of main
	
	static boolean ArrayEqual(int[] n1, int[] n2) {
		
		if(n1.length != n2.length)//1차적으로, 길이가 상이하다면 바로 false
			return false;
		
		for(int i = 0; i < n1.length; i++)//2차적으로, 길이가 같다면 요소끼리 각각 비교
			if(n1[i] != n2[i])
				return false;
		
		return true;
	}//end or ArrayEqual

}//end of class
