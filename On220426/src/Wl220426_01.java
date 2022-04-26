
public class Wl220426_01 {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 10;
		
		System.out.println(s.name);
		System.out.println(s.ban);
		System.out.println(s.math);
		
		s.getAverage();
		System.out.println("------------");
		
		Student s2 = new Student();
		s2.name = "이순신";
		s2.kor = 90;
		s2.eng = 80;
		s2.math = 90;
		
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.math);
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAverage());
		System.out.println("------------");
		
		Student s3 = new Student();
		s3 = s;
		
		System.out.println(s3.name);
		System.out.println(s3.ban);
		System.out.println(s3.math);
		s.getAverage();
	}//end of main
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
//		getAverage();
//		ban = 10;
//		math = 20;
		int sum = kor + eng + math;
		return sum;
	}
	
	double getAverage() {
//		getTotal();
//		ban = 10;
//		math = 20;
		return getTotal()/3.0;
	}
}