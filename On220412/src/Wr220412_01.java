
public class Wr220412_01 {

	public static void main(String[] args) {
		
		short n1 = 10, n2 = 20;
		double print = sub (n1, n2);//큰 그릇 ~ (작은 그릇)
		System.out.println(print);
		
	}//end of main

	public static float sub (int i, int j) { //중간 그릇 ~ (큰 그릇)

		//작은 그릇
		int result = i + j;
		return result;
	}
	
}

