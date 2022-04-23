
public class Wl220406_02 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
//		<<, >> : 머리방향으로 이동!!(in 2진수)
		System.out.println(8 << 2); //왼쪽으로 2bit 이동
		System.out.println(8 >> 2); //오른쪽으로 2bit 이동
		
		System.out.println("\n-2-");
		int num = 10;
		int num2 = 5;
//						   //  조건      조건참  조건거짓
		System.out.println(num > num2 ? num : num2);
		
		int num3 = num > num2 ? num : num2;
//		String num3 = num > num2 ? "a" : "b"; // ←얘는 되는데
//		String num3 = num > num2 ? num : num2; // ←얘는 에러뜸
		System.out.println(num3);
		
	}

}

