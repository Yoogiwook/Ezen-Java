package polymorphism;

public class SamsungTV implements TV{
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
		System.out.print("SamsungTV---전원 켠다.");	
		System.out.printf(" 가격 : %d\n",price);
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");	
	}
	public void volumeUp() {
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	public void volumeDown() {
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
