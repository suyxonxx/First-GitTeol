
public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
			
		v2 = v1;
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	} //end of main
} //end of class EqualsEx1

class Value {
	int value;
	
	Value() {}
	Value(int value) {
		this.value = value;
	}
	
//	아래의 equals method를 overriding하지 않을 경우
//	위에서 비교하고자 한 정수값이 아닌 v1 v2가 각각 참조하는 공간의 주소값끼리 비교하는 참사가 벌어짐
	@Override
	public boolean equals(Object obj) { //매개변수의 type이 Object라는 건
//											모든 class의 참조변수들을 받아주겠다는 뜻.
		if(obj instanceof Value) { //v1.equals(v2)에서
			return value/*v1*/ ==/*equals*/ ((Value)obj).value/*v2*/;
		}
		return false;
	}
} // end of class Value
