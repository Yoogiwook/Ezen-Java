class Tv1{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDonw() { --channel; }
}
public class TvTest_6_2 {

	public static void main(String[] args) {
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		System.out.println("t1의 channel값은 "+ t1.channel+"입니다");
		System.out.println("t2의 channel값은 "+ t2.channel+"입니다");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+ t1.channel+"입니다");
		System.out.println("t2의 channel값은 "+ t2.channel+"입니다");
	}

}
