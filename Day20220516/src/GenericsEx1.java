
class Apple{
	@Override
	public String toString() {
		return "I am apple";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am orange";
	}
}

class Box{
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
}
public class GenericsEx1 {

	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setOb(new Apple());
		oBox.setOb(new Orange());
		
		Apple ap = (Apple)aBox.getOb();
		System.out.println(ap);
		
		Orange or = (Orange)oBox.getOb();
		System.out.println(or);
		System.out.println("------------------");
		aBox.setOb("apple");//에러
		oBox.setOb("orange");//에러
		
//		Apple ap4 = (Apple)aBox.getOb();//Apple은 String 타입이 아니라서 에러
		System.out.println(aBox.getOb());//출력은 잘 됨
		
		
	}

}
