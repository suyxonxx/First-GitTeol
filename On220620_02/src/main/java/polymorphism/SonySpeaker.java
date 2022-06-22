package polymorphism;

import org.springframework.stereotype.Component;

@Component("sonys")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("SonySpeaker 생성자");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker...안들린다데스");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker...시끄럽다데스");
	}
}
