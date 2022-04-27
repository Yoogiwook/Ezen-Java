public class Ex6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
//		this.num=1;
//		this.isKwang = true;
		this(1,true); //생성자 안에서 다른생성자 값(타입)이랑 일치하는 것을 호출
	}
	
	public SutdaCard(int num, boolean isKwang) {
		if(num>=1 && num<=10)
			this.num = num;
		else
			this.num = 0;
		
		this.isKwang = isKwang;
	}
	
	String info() {
//		return num + (isKwang==true? "K" : "");
		return num + (isKwang? "K" : "");
	}
}
