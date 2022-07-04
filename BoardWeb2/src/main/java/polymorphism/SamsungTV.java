package polymorphism;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component //Component 어노테이션이 있으면 메모리에 올라가있는다.
public class SamsungTV implements TV{
//	@Autowired
//	@Qualifier("appleSpeaker")
	@Resource(name="appleSpeaker") //Resource를 이용하면 위 두문장을 하나로 축약할 수 있다.
	private Speaker speaker;
	private int price;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}
	public SamsungTV() {
		System.out.println("SamsungTV 생성자(default)");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 생성자(1개)");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 생성자(2개)");
		this.speaker = speaker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");	
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");	
	}
	public void volumeUp() {
//		System.out.println("SamsungTV---소리 키운다.");	
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown() {
//		System.out.println("SamsungTV---소리 내린다.");	
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
