package LGSamsung;

public class LgTv implements TV{

	@Override
	public void PowerOn() {
		System.out.println("Lg.....On");
	}
	@Override
	public void PowerOff() {
		System.out.println("Lg.....Off");
	}
	@Override
	public void VolumeUp() {
		System.out.println("LgVol.....Up");
	}
	@Override
	public void VolumeDown() {
		System.out.println("LgVol.....Down");
	}
}
