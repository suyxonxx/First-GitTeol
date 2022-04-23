
public class Wl220415_04 {

	public static void main(String[] args) {
		
//		버스 기본요금 : 1500원
//		나이는 랜덤함수로 입력을 받음. (입력X, 출력O)
//		할인율은 0 ~ 3세 : 100% / 4 ~ 13세 : 50% / 14~19세 : 25% / 20세 이상 : 0% / 65세 이상 : 100%
//		버스요금을 계산해보자
		
		int age = ranA();
		System.out.printf("나이가 %d살일 때 ", age);
		
		int fee = 1500;
		double rate = 0.0;
		
		if (age >=4 && age <= 13) {
			rate = 0.5;
		}
		else if (age >=14 && age <= 19) {
			rate = 0.75;
		}
		else if (age >=20 && age < 65) {
			rate = 0.0;
		}
		
		System.out.printf("내야하는 버스 요금은 %d원 입니다.\n", (int)(fee * rate));
		
	} //end of main
	
	public static int ranA() {
		
		int age = (int)(Math.random() * 120 + 1);
		
		return age;
		
	} //end of sub

}

