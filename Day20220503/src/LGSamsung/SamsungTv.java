package LGSamsung;

public class SamsungTv implements TV{

	@Override
	public void PowerOn() {
		System.out.println("Sam.....On");
	}
	@Override
	public void PowerOff() {
		System.out.println("Sam.....Off");
	}
	@Override
	public void VolumeUp() {
		System.out.println("SamVol.....Up");
	}
	@Override
	public void VolumeDown() {
		System.out.println("SamVol.....Down");
	}
}
