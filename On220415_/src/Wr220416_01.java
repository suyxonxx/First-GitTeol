
public class Wr220416_01 {

	public static void main(String[] args) {
		
		double d = 10.123456789;
		
//		1. 소수점 아래자리 붙이기 밑 자르기
		System.out.printf("1-1 : [%f]\n", d); //부동소수점 형식은 기본적으로 6자리까지 표시하며, 마지막 자리는 반올림됨.
		System.out.printf("1-2 : [%.9f]\n", d); //따라서, n째 자리까지 표시하려면, '.n'을 붙여주어야 함.
		System.out.printf("1-3 : [%.3f]\n", d); //표시되는 자릿수를 줄이는 것도 마찬가지임.
		System.out.printf("1-4 : [%.12f]\n", d); //변수값의 소수점 아래 자릿수보다 더 큰 숫자를 입력하면, 뒤가 0으로 메꿔짐.
		
//		2. 전체 자릿수까지 정렬하기 : %전체자리.소수점아래자리
//		10진 정수의 자릿수를 정렬하는 방법과 유사하며, '.'도 자릿수에 포함됨.
		System.out.printf("2-1 : [%12.9f]\n", d);
		System.out.printf("2-2 : [%15.9f]\n", d);
		System.out.printf("2-3 : [%015.9f]\n", d);
		
	}

}

