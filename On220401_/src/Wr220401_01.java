
public class Wr220401_01 {

	public static void main(String[] args) {
		
		
		System.out.println("-1-");
		int hisAge = 24; //이 곳의 값을 바꾸면, 변수의 초기화
		hisAge = 27; //이 곳의 값을 바꾸면 그냥 Print되는 변수 값 변경에 불과
		System.out.println(hisAge);
		System.out.println("");
		
		System.out.println("-2-");
		int myAge = 25;
		int nextYear = 0;
		
		myAge = myAge + 1;
		nextYear = 1998 + myAge - 1;
		
		System.out.println("My age in next year : " + myAge);
		System.out.println("Next year is " + nextYear);
		System.out.println("");
		
		System.out.println("-3-");
		int x = 10;
		int y = 20;
		
		System.out.println("x = " + x + ", " + "y = " + y);
		System.out.println("Hey " + x + y);
		System.out.println("Hey " + (x + y));
		System.out.println("");
		
		System.out.println("-4-");
		int tmp;
		
//		x, y, tmp를 각각 변수를 담는 컵이라고 생각해보자.
//		이 때, tmp컵은 x컵과 y컵의 내용물을 맞교환하는 과정에서 필요한 임시 컵과 같다.
		
		tmp = x; //먼저, x컵에 담겨있던 내용물을 tmp컵으로 옮겨담고
		x = y; //빈 상태가 된 x컵으로 y컵에 있던 내용물을 옮겨담자
		y = tmp; //마지막으로, 빈 상태가 된 y컵으로 tmp컵에 담긴 내용물을 옮겨담으면 맞교환 끝
		
		System.out.println("x = " + x + ", " + "y = " + y);
		System.out.println("Hey " + x + y);
		System.out.println("Hey " + (x + y));
		
	}

}

