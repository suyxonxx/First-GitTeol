
class Time {
	int hour;
	int minute;
	int second;
	
	static int num = 100;
}

public class Wl220505_01 {
	
	public static void main(String[] args) {
		Time[] t = new Time[3]; //이 과정은 객체 생성이 이루어지는 과정이 아님. 아직은 Time클래스에
								//접근 불가능한 상태임.
		
//		배열의 요소들이 객체를 각각 생성하여 각기 다른 공간을 참조하므로, 아래에서 서로 다른 주소값이 찍힘.
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time();
		
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println("--------------");
		
//		클래스(static) 변수는, class명을 앞에 붙여준 후 바로 사용 가능
		System.out.println(Time.num);
	}
}
