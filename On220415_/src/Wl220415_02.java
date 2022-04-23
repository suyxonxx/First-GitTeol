
public class Wl220415_02 {

	public static void main(String[] args) {
		
//		이건 나이를 입력하고, 요금을 입력받는거. (입력O, 출력O)
		int age = (int)(Math.random() * 120 + 1);
		
		System.out.printf("나이가 %d살일 때 ", age);
		
		int print = sub(age);
		
		System.out.printf("내야하는 버스 요금은 %d원 입니다.\n", print);
		
	} //end of main
	
	public static int sub(int age) {
		
		int feeO = 1500;
		int feeA = 0;
		
		if (age >=4 && age <= 13) {
			feeA = (int)(feeO * 0.5);
		}
		else if (age >=14 && age <= 19) {
			feeA = (int)(feeO * 0.75);
		}
		else if (age >=20 && age < 65) {
			feeA = feeO;
		}
		
		return feeA;
		
	} //end of sub

}

