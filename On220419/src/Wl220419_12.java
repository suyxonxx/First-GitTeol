
public class Wl220419_12 {

	public static void main(String[] args) {
		
//		배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'를 찍어서 그래프를 그리는 프로그램
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		
		int[] counter = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i] + " > ");
			for(int j = 0; j < counter[i]; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		
	}//end of main

}//end of class
