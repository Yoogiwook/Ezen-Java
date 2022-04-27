
public class Tv {

		
		String color;
		boolean power;	 //인스턴스 변수
		int channel;	 //채널 번호 저장
		
		void power() {power = !power;}
		void channelUp() { ++channel; }
		void channelDown() { --channel; }
		
	}
	class TvTest {
		public static void main(String[] args) {
			Tv t;
			t = new Tv();
			t.channel = 7;
			t.channelDown();
			System.out.println("현재 채널은 " + t.channel + " 입니다.");
			
			Tv t2 = new Tv();
			t2.channel = 10;
			t2.channelUp();
			System.out.println(t2.channel);
			
			Tv t3 = t2;
			
	}

}
