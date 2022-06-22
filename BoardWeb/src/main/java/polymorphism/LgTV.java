package polymorphism;

import org.springframework.stereotype.Component;

@Component("lg") // id를 지정해주지 않으면 클래스명의 첫번째를 소문자로 바꾸고 클래스명을 id로 사용
public class LgTV implements TV{
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("LgTV 생성자(default)");
	}
	public LgTV(Speaker speaker) {
		System.out.println("LgTV 생성자(1개)");
		this.speaker = speaker;
	}
	public LgTV(Speaker speaker, int price) {
		System.out.println("LgTV 생성자(2개)");
		this.speaker = speaker;
		this.price = price;
	}
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");	
	}
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");	
	}
	public void volumeUp() {
		System.out.println("LgTV---소리 키운다.");	
//		speaker.volumeUp();
	}
	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");	
//		speaker.volumeDown();
	}
}
