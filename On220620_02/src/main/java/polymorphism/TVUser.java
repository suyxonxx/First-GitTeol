package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.VolumeUp();
//		tv.VolumeDown();
//		tv.powerOff();
		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.VolumeUp();
//		tv.VolumeDown();
//		tv.powerOff();
		
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean(args[0]);
//		tv.powerOn();
//		tv.VolumeUp();
//		tv.VolumeDown();
//		tv.powerOff();
		
//		생성자를 호출하는 역할을 함. (객체를 대신 생성해줌)
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		TV tv = (TV) factory.getBean("tv1");
	}
}
