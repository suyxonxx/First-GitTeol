
import java.util.Scanner;
//import java.util.InputMismatchException;

public class ExceptionTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("▼ 정수 입력");
		
		int sum = 0;
		
//		어떤 구문에 문제가 발생할 소지가 있다고 판단될 경우, 해당 구문을 try-catch문으로 감싸주어야 함
//		catch의 block을 비워놓으면, console창을 봤을 때 어떤 오류가 발생했는지 알 길이 없음.
//		catch 구문의 작성 순서 : 맨 위부터 상속 계층도의 최하위 클래스(응애)를 시작으로,
//		맨 아래에서는 최상위 클래스(조상님의조상님)에 대해 작성할 것.
//		try {
//			int num = sc.nextInt();
//			int a = 10 / num;
//		} catch(ArithmeticException e) {
//			e.printStackTrace();
//		} catch(InputMismatchException e) {
//			e.printStackTrace();
//		}
		
//		Exception이 ArithmeticException, InputMismatchException 등의 상위 class이므로
//		하나로 퉁치기가 가능하긴 함. But 실무에 투입될 경우, 에러에 대한 효과적인 2차 대응을 대비하기 위해
//		아래의 catch문보다 위의 catch문을 사용하는 것이 더 바람직함.
		try {
			int num = sc.nextInt();
			System.out.println(num);
			int a = 10 / num;
			System.out.println(a);
		} catch(Exception e) {
			e.printStackTrace();
		} finally { //예외 발생 여부와 무관하게, 무조건 거쳐야 하는 종단 구문임.
			sc.close();
		}
		
		for(int i = 0; i <= 100; i++)
			sum += i;
		
		System.out.println("sum = " + sum);
	} //end of main
}
