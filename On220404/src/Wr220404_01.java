import java.util.Scanner;

public class Wr220404_01 {

	public static void main(String[] args) {
		
		System.out.println("당신이 좋아하는 연예인은 누구인가요?");
		
		//객체              //객체 생성 → new 클래스로 클래스 객체 생성!
		Scanner scanhaja = new Scanner(System.in);
		String starname = scanhaja.nextLine();
		
		System.out.println(starname + "은(는) 당신이 살아 숨쉬는 존재라는 것 조차 모른다 휴먼");
		System.out.println("아잇 죄송죄송ㅎ");
		System.out.println("그나저나 당신의 나이는 어떻게 되시나요?");
		
		String wonraemunja = scanhaja.nextLine();
		int yourAge = Integer.parseInt(wonraemunja);//받은 문자열을 정수로 돌려주겠다는 의미
		
		System.out.println(yourAge + "살이라니 꽤나 늙었군요 휴먼!");
		System.out.println("메롱이지 말입니다");
		System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		
		scanhaja.close();
		
	}

}

