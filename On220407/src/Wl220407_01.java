
public class Wl220407_01 {

	public static void main(String[] args) {
		
		System.out.println("-1-");
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
//		System.out.println(true + null);
//		println 뒤의 괄호에 연산자가 들어간 부분이 큰따옴표로 둘러쌓여 있지 않은 경우,
//		숫자가 우선임!!
		
		System.out.println("\n-2-");
		int num = 10;
		System.out.println(num > 0 ? "양수" : num == 0 ? "0" : "음수"); //중첩 시, false 부분에서 괄호 빼셈!!

		System.out.println("\n-3-");
		int num1= 456;
		System.out.println((num1 / 100) * 100);
		System.out.println((num1 / 100) + "00");
		System.out.println("");
		
		int num2 = 333;
		System.out.println((num2 / 10) * 10 + 1);
		System.out.println("");
		
		int num3 = 24;
		System.out.println((((num3 + 10) / 10) * 10) % num3);
		System.out.println(((num3 / 10 + 1) * 10) % num3);
		System.out.println(10 - num3 % 10);
		
		System.out.println("\n-4-");
		int fahrenheit = 100;
		float celcius = ((((5/9f * (fahrenheit - 32)) * 1000 + 5) / 1000));
		
		celcius = (5/9f * (fahrenheit - 32) * 100);
		celcius = (5/9f * (fahrenheit - 32) * 100) + 0.5f;
		celcius = (int)((5/9f * (fahrenheit - 32) * 100) + 0.5f);
		celcius = (int)((5/9f * (fahrenheit - 32) * 100) + 0.5f) / 100f;
		
		System.out.println(fahrenheit);
		System.out.println(celcius);
		
	}

}

