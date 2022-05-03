package SamsungLG_2;

public class BeanFactory {
	public Object getBean(String beanName) { //반환타입이 object : 모든 타입을 반환시켜줄 수 있다는 뜻
		if(beanName.equals("SamsungTV")) {
			return new SamsungTV();
		} else if(beanName.equals("LGTV")) {
			return new LGTV();
		}
		return null;
	}
}
