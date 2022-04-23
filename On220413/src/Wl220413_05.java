
public class Wl220413_05 {

	public static void main(String[] args) {
		
//		크기가 5인 int형 배열을 생성
		int [] score = new int [5];
		
//		각 요소에 직접 값을 저장
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		
//		아래와 같이 쓸 수도 있음
//		1.
//		int [] score = new int [] {100, 90, 80, 70, 60};
//		2.
//		int [] score = {100, 90, 80, 70, 60}; //우항 맨 앞의 new int[] 생략 가능
		
//		아래와 같이 쓸 수는 없음
//		int [] score;
//		score = {100, 90, 80, 70, 60}; //분리해서 쓸 시, new int[] 생략 불가능
		
	}

}

