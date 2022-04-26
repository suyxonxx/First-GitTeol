import lombok.ToString;

public class Wl220426_04 {

	public static void main(String[] args) {
		
	Student4 s = new Student4 ("홍길동", 1, 1, 100, 60, 76);	
		
		System.out.println(s.info());
		System.out.println(s.toString());
	}

}
@ToString
class Student4 {
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	Student4() {}; //default 생성자 반드시 기입!
	
	Student4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)getTotal()/3.0f;
	}
	
	String info() {
		return (name + ", " + ban + ", " + no + ", " + kor + ", " + eng
				+ ", " + math + ", " + getTotal() + ", " + getAverage());
	}
	
}
