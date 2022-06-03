
class Apple2{
	@Override
	public String toString() {
		return "I am apple";
	}
}

class Orange2{
	@Override
	public String toString() {
		return "I am orange";
	}
}

class Box2<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}
public class GenericsEx2 {

	public static void main(String[] args) {
		Box2<Apple2> aBox = new Box2<Apple2>();
		
		Box2<Orange2> oBox = new Box2<Orange2>();
		
		Box2<String> sBox = new Box2<String>();
		
		aBox.setOb(new Apple2());
		oBox.setOb(new Orange2());
		sBox.setOb("123");
		
		
		Apple2 ap = aBox.getOb();
		Orange2 or = oBox.getOb();
		System.out.println(ap);
		System.out.println(or);
		
//		aBox.setOb("new Apple()");// 타입이 Apple2만 가능한데 String 타입이 들어가려해서 에러
	}

}
