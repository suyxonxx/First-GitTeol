import java.util.Arrays;

public class Wl220413_10 {

	public static void main(String[] args) {
		System.out.println("-1-\n편-안");
		char[] abc = {'A', 'B', 'C', 'D'};//length = 4
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};//length = 10
		System.out.println(abc);//ABCD
		System.out.println(num);//0123456789
		
		char[] result = new char[abc.length + num.length];//length = 14
//		abc 0번부터의 내용을 result의 0번부터 abc.length개 만큼 (=0~3번으로 각각) 복사
		System.arraycopy (abc, 0, result, 0, abc.length);
//		num 0번부터의 내용을 result의 abc.length(=4)번부터 num.length개 만큼(=4~13번으로 각각) 복사
		System.arraycopy (num, 0, result, abc.length, num.length);
		System.out.println(result);//ABCD0123456789
		
		System.arraycopy (abc, 0, num, 0, abc.length);
		System.out.println(num);//ABCD456789
		
		System.arraycopy (abc, 0, num, 6, 3);
		System.out.println(num);//ABCD45ABC9

		System.out.println("\n-2-\n불-편");
		char[] tmp = new char[14];
		for(int i = 0; i < abc.length; i++)
			tmp[i] = abc[i];
		
		System.out.println(tmp);
		
		for(int i = 0; i < num.length; i++)
				tmp[abc.length + i] = num[i];
		
		System.out.println(tmp);
		
		System.out.println("\n-3-");
		int[] abc1 = {10, 20, 30, 40, 50};
		int[] abc2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(Arrays.toString(abc1));
		System.out.println(Arrays.toString(abc2));
		
		System.arraycopy(abc1, 2, abc2, 2, 3);
		System.out.println(Arrays.toString(abc2));
	}

}

