
public class Wl220425_02 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}

}

class Student {
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return ((int)(10 * getTotal()/3.0f + 0.5f))/10.0f;
	}
}