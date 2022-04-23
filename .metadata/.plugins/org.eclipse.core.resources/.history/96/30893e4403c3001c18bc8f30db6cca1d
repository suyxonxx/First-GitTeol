import java.util.*;

public class Wl220422_08 {

	public static void main(String[] args) {
//		학생 5명, 2과목(영어, 수학)의 점수를 입력받아서 과목별 평균, 학생별 평균을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int number = 5;
		int[][] subject = new int [number][2];
		int[] totalStudent = new int[number];
		int[] totalSubject = new int[2];
		
		System.out.printf("%d명 영어, 수학 점수 입력%n", number);
		
		for (int i = 0; i < number; i++) {
			System.out.printf("%d번 영어 : ", i + 1);
			subject[i][0] = sc.nextInt();
			System.out.printf("%d번 수학 : ", i + 1);
			subject[i][1] = sc.nextInt();
			System.out.println("------------");
			
			totalStudent[i] = subject[i][0] + subject[i][1];
			totalSubject[0] += subject[i][0];
			totalSubject[1] += subject[i][1];
		}//end of for
		
		System.out.println("번호\t영어\t수학\t평균");
		
		for(int i = 0; i < number; i++)
			System.out.printf("%3d\t%3d\t%3d\t%.1f%n", i + 1, subject[i][0], subject[i][1]
															, (double)totalStudent[i] / 2);
		
		System.out.printf("평균\t%.1f\t%.1f", (double)totalSubject[0]/number,
											(double)totalSubject[1]/number);
		
		sc.close();
	}//end of main

}//end of class
