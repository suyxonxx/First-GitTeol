
class Apple {
	@Override
	public String toString() {
		return "사과";
	}
}

class Orange {
	@Override
	public String toString() {
		return "오렌지";
	}
}

class AppleBox {
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
}

class OrangeBox {
	private Orange or;

	public Orange getOr() {
		return or;
	}

	public void setOr(Orange or) {
		this.or = or;
	}
}

class Box {
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
}

public class GenericsEx1_1 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setOb(new Apple());
		oBox.setOb(new Orange());
		
		Apple ap = (Apple)aBox.getOb();
		System.out.println(ap);
		
		Orange or = (Orange)oBox.getOb();
		System.out.println(or);
		System.out.println();
		
		AppleBox ap2 = new AppleBox();
		ap2.setAp(new Apple());
//		ap2.setAp(new Orange()); //←Orange type을 받아줄 수 없으므로 error.
		
//		런타임 에러가 발생할 가능성이 다분함!!
//		aBox.setOb("사과사과사과");
//		oBox.setOb("오렌지오렌지");
		
//		Apple ap4 = (Apple)aBox.getOb();
		System.out.println(aBox.getOb());
		
	}
}
