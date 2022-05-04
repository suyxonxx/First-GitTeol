
public class ExceptionEx17 {

	public static void main(String[] args) {
		int a = 100;
		int b;
		try {
//			method1();
			b = a / 10;
		} catch(Exception e) {
			System.out.println("main method에서 예외가 처리되었습니다.");
//			e.printStackTrace();
		} finally {
			System.out.println("덩기덕쿵더러러러");
		}
		System.out.println("쿵기덕쿵더러러러");
	} //end of main
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 method에서 예외가 처리되었습니다.");
			throw e; //다시 예외를 발생시킨다.
		}
	} //end of method1
}
