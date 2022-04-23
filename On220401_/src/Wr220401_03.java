import java.util.Scanner;

public class Wr220401_03 {

	public static void main(String[] args) {
		
		String name = "";
		int age = 99;
		
		Scanner scanleggo = new Scanner(System.in);
		name = scanleggo.nextLine();
		
		System.out.println("name : " + name + ", " + "age : " + age);
		System.out.printf("name : %s, age : %d%n", name, age);
		
//		아니 근데 콘솔창에 아무 글자나 입력하고 엔터 치면 name : 입력한 글자, age : 설정된 age값이
//		일괄적으로 뜨는데 이건 뭐 내가 생각한 스캔이랑은 달라도 너무 다르당
		
		scanleggo.close();
		
	}

}
