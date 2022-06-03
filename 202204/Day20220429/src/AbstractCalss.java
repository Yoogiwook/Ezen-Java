
public class AbstractCalss {

	public static void main(String[] args) {
		
		Product1 pro = new Audio1();
		System.out.println(pro.price);
		pro.test();
		pro.func();
		
	}

}

abstract class Product1{ // abstract 가 붙으면 미완성클래스로 바뀌어 객체생성 불가능, 하위클래스에서는 생성 가능
	int price;
	
	Product1(int price){
		this.price = price;
		}
	void test() {
		System.out.println("Product");
	}
	
	abstract void func(); // 추상메소드 => 기본 뼈대만 제공 내용은 하위클래스에서 내용을 채워서 써야함
}

class Tv1 extends Product1{
	Tv1() { super(100); }  //자신의 가격을 상위 클래스로 전달
	
	public String toString() { return "Tv"; }  // 호출되면 출력되게 함

	@Override
	void func() {  //  <= 무조건 갖다 써야함 내용은 안써도 상관없음
		System.out.println("Tv");
	}
}

class Computer1 extends Product1 {
	Computer1() { super(200); }
	
	public String toString() { return "Computer";}

	@Override
	void func() {
		System.out.println("Computer");
	}
}

class Audio1 extends Product1 {
	Audio1() { super(50); }
	
	public String toString() { return "Audio"; }

	@Override
	void func() {
		System.out.println("Audio");
	}
}