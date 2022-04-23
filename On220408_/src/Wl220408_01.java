
public class Wl220408_01 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		int sum1 = 0;
		for(int i1 = 1; i1 < 6; i1++) {
			sum1 +=i1; //누적을 위한 임시 변수.
		
		System.out.println("sum = " + sum1);
		
		}
		
		System.out.println("Lastsum = " + sum1);
//		System.out.println("i = " + i1 + ", " + "Lastsum = " + sum1); //여기에 i값을 찍으면 에러남.
		

		System.out.println("\n-2-");
		int sum2 = 0;
		int i2 = 1; //i값을 먼저 선언함으로써, 아래의 초기값 설정 과정을 생략할 수 있음
		for ( ; i2 < 6; i2++) {
			sum2 +=i2; //누적을 위한 임시 변수.
		
		System.out.println("sum = " + sum2);
		
		}
		
		System.out.println("Lastsum = " + sum2);
		System.out.println("i = " + i2 + ", " + "Lastsum = " + sum2); //여기엔 찍을 수 있음.
		

		System.out.println("\n-3-");
		int sum3 = 0;
		int i3 = 1;
		for ( ; i3 < 6; ) {
			i3++; // 이 경우, 초기값에 대한 과정은 생략하고 다음 과정부터 반복됨. 아 그리고 빼먹지 않도록 주의!!!
			sum3 +=i3; //누적을 위한 임시 변수.
		
		System.out.println("sum = " + sum3);
		
		}
		
		System.out.println("Lastsum = " + sum3);
		

		System.out.println("\n-4-");
		int sum4 = 0;
		int i4 = 1;
		for ( ; i4 < 6; ) {
			i4++;
//			sum4 = i4++; //얘도 되긴 하지만
			sum4 += i4; //얘가 더 직관적임
		
		System.out.println("sum = " + sum4);
		
		}
		
		System.out.println("Lastsum = " + sum4);
		
		
	}

}

