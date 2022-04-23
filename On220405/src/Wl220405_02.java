
public class Wl220405_02 {

	public static void main(String[] args) {

		char cA = 'a';
		for(int i=0; i<6; i++) { //~i++)뒤에 세미콜론 붙이면 안됨!!!!
			System.out.print(++cA); //println 아님!!!
		}
		
		System.out.println("\n");
		
		char cB = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print(cB++);
		}
		
		System.out.println("\n");
		
		float pi = 3.14195f;
		float kiloPi = (int)(pi * 1000);
		float result = (kiloPi / 1000);
		System.out.println(result);
		
		float kiloPii = (int)((pi + 0.0005) * 1000);
		float resultt = kiloPii / 1000;
		System.out.println(resultt);
		
		float resulttt = (int)(pi*1000) / 1000.0f;
		System.out.println(resulttt);
		
		float resultttt = (int)(pi*1000 + 0.5f) / 1000.0f;
		System.out.println(resultttt);
	}

}

