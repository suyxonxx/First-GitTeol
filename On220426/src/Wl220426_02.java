import lombok.Getter;
import lombok.Setter;

public class Wl220426_02 {
	
	public static void main(String[] args) {
//		생성자 호출 >> 디폴트 생성자
		Student2 s = new Student2("손흥민", 1, 10, 90, 100, 60);
		System.out.println(s.getName());
		System.out.println(s.getTotal());
		
		Student2 s2 = new Student2("손만두", 2, 9, 90, 80, 70);
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		
		Student2 s3 = new Student2("손찐빵", 2, 9);
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());
		
	}//end of main
}
//@* : 어노테이션 (Annotation)
@Getter
@Setter
//접근 범위 대소 비교 : private < default < protected < public
class Student2 {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;

//	함수 오버로딩 >> 함수 이름 중복 가능! (특성 상, 생성자의 이름이 클래스의 이름과 같아야 하기 때문)
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student2(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
}
