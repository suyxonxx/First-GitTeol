
public class Wl220412_07 {

	public static void main(String[] args) {
//		A-3. 입력 (O), 출력 (O)
		int input = 3;
		
		boolean flag = ggd(input); //return과 type이 일치해야 함.
		
		if (flag == true)
			System.out.println("출력 성공");
		else
			System.out.println("출력 실패");
			
				
	}
	
	public static //←기본 뼈대.
	boolean ggd(int n) {
		
		boolean flag = false;
		
		if(flag == true) {
		System.out.println(n + "단 출력");
		for(int i = 1; i <= 9; i++)
			System.out.println(n * i);
		}
		else
			System.out.println("ㅠㅠ");
		
		return flag;
		
	}
}

