import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜 : " + date.format(today));
		System.out.println("현재 시간 : " + time.format(today));
		
		Test t = new Test2();
		t.func();
	}

}

abstract class Test {
	int num = 100;
	abstract void func();
	abstract void func2();
}

class Test2 extends Test {
	@Override
	void func() {
		System.out.println("num : " + num);
	}
	@Override
	void func2() {}
}