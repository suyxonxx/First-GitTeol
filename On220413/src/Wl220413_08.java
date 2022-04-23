import java.util.*;

public class Wl220413_08 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[5]; //iArr1 방이 5칸인 상태. 10칸으로 확장공사하려 함.
		
		int[] tmp = new int[iArr1.length * 2];
		
		for(int i = 0; i < iArr1.length; i++)
			iArr1[i] = (int)(Math.random() * 10) + 1;
		
		System.out.println(Arrays.toString(iArr1));
		
		//#1
		for(int i = 0; i < iArr1.length; i++)
			tmp[i] = iArr1[i];
		//#2
		iArr1 = tmp;
		
//		만약, #1과 #2의 순서가 바뀐다면, tmp가 그대로 iArr1을 집어삼켜버림.
//		따라서, 원래 iArr1에 저장되어 있던 값이 모두 날라감
		
		System.out.println(Arrays.toString(iArr1));
	}

}

