import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ReflectionEx1 {
	public static void main(String[] args) throws Exception {
//		Test tt = new Test();
		
		Class clsName = Class.forName("Test");
		Object obj = clsName.getDeclaredConstructor().newInstance();
		
		System.out.println(obj.getClass().getName());
		
		Method[] method = clsName.getDeclaredMethods();
		System.out.println(method);
		
		for(Method m : method)
			System.out.println(m);
		
		Field[] field = clsName.getDeclaredFields();
		
		for(Field f : field)
			System.out.println(f.getInt(obj));
	}
}

class Test {
	int num = 10;
	double dnum = 10.5;
	String str = "korea";
	void func1() {}
	void func2() {}
	void func3() {}
}
