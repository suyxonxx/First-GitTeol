package SamsungLG_2;

public class TestUser {
	public static void main(String[] args) {
		
//		interface의 사용으로 뼈대를 통일함으로써
//		코드 재탕이 가능해지고, 수정이 훨씬 용이해졌구나!
		
//		TV tv = new LGTV();
//		tv.PowerOn();
//		tv.PowerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]); //'String[] args'의 그 args 배열 맞음
//		Run >> Run configurations... >> Arguments에 문자열을 입력하면 실행됨.
		tv.PowerOn();
		tv.PowerOff();
		tv.volumeUp();
		tv.volumeDown();
		System.out.println(java.util.Arrays.toString(args));
	}
}
