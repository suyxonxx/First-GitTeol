
public class Wl220404_01 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		int i = 10;
		float f = 20.0f;
		float result = i + f;
		System.out.println(result);
		System.out.println("");
		
		System.out.println("-2-");
		double dolswe = 1.666666;
		int unnyeon = 0;
		unnyeon = (int)dolswe;
		System.out.println("dolswe : " + dolswe + ", " + "unnyeon : " + unnyeon);
		System.out.println("");

		System.out.println("-3-");
		long aa = 1_000_000L;
		long bb = 2_000_000L;
//		원래 위처럼 써줘야 하지만 아래처럼 써도 멀정히 돌아가긴 함
//		----------1----------
//		long aa = 1_000_000;
//		long bb = 2_000_000;
//		----------2----------
//		long aa = (int)1_000_000;
//		long bb = (int)2_000_000;
		
		long cc = (aa * bb);
		System.out.println(cc);

	}

}

