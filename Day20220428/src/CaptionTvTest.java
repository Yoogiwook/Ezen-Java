class Tv{
	private boolean power;
	private int channel;
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	private boolean caption;
	
	public boolean isCaption() {
		return caption;
	}
	public void setCaption(boolean caption) {
		this.caption = caption;
	}
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.setChannel(10);
		ctv.channelUp();
		System.out.println(ctv.getChannel());
		ctv.displayCaption("Hello, World");
		ctv.setCaption(true);
		ctv.displayCaption("Hello, World");
	}

}
