package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext3.xml");
		TV tv = (TV) factory.getBean("lg");
		
		tv.powerOn();
		tv.VolumeUp();
		tv.VolumeDown();
		tv.powerOff();
		
		factory.close();
	}
}
