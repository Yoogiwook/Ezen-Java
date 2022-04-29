//다음은 물건을 구입하는 사람을 정의한  Buyer 클래스이다. 이 클래스는 멤버변수로 돈(money) 과 
//장바구니를(cart) 가지고 있다. 제품을 구입하는 기능의 buy메서드와 장바구니에 구입한 물건을 
//추가하는 add메서드 구입한 물건의 목록과 사용금액 그리고 남은 금액을 출력하는 summary메서드를 
//완성하시오.
//1. 메서드명 : buy
//   기   능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 뺴고,
//   			장바구니(cart)에 담는다. 
//   			만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
//   반환타입 : 없음
//   매개변수 : Product p - 구입할 물건
//   
//2. 메서드명 : add
//   기   능 : 지정된 물건을 장바구니에 담는다.
//   			만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린다음에 담는다.
//   반환타입 : 없음
//   매개변수 : Product p - 구입할 물건
//
//3. 메서드명 : summary
//   기   능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
//   반환타입 : 없음
//   매개변수 : 없음

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer(); 		// 객체 생성
		b.buy(new Tv());			// Tv객체 생성 하고 p[0] 이 Tv 값을 참조하도록 함
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열 생성
	
	int i=0; //Product 배열 cart에 사용될 index
	
	void buy(Product p) {
//		(1)아래의 로직에 맞게 코드를 작성하시오.
//		1.1 가진 돈과 물건의 가격을 비교해서 가진돈이 적으면 메서드를 종료한다.
//		1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
//		1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
		if(money < p.price) {
			System.out.println("잔액이 부족하여 "+ p +"을/를 구매할 수 없습니다.");
			return; // 잔액보다 물품 금액이 크면 종료
		}
		money -= p.price; // 선택한 물품 금액만큼 money 에서 차감
		add(p);
		
	} //buy(Product P) end
	
	void add(Product p) {
//		(2) 아래의 로직에 맞게 코드를 작성하시오.
//		1.1 i의 값이 장바구니의 크기보다 같거나 크면
//		  1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
//		  1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
//		  1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
		if(i >= cart.length) {
			Product[] tmp = new Product[cart.length*2]; // 카트공간 확장
			System.arraycopy(cart, 0, tmp, 0, cart.length); // 확장한 카트 공간에 기존 물품 옮기기
			
//			tmp = Arrays.copyOf(cart, cart.length);  // 에러;; 배열 자체도 복사하기때문에 배열 크기도 3으로 줄음
//			for(int j=0; j<cart.length; j++)   //for문을 이용해서도 복사 가능
//				tmp[j] = cart[j];
			
			cart = tmp; 	//tmp 값을 cart에 저장, 원래의 저장공간은 Gc에 의해서 사라짐
		}
//		1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
		cart[i++] = p; // cart[i]가 참조하고 있는 공간 i를 1 증가시켜서 다음 공간을 참조하게 함
	} //add(Product P) end
	
	void summary() {
//		(3) 아래의 로직에 맞게 코드를 작성하시오.
//		1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
//		1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
//		1.3 물건을 사고 남은 금액(money)를 출력한다.
		String itemList = ""; //구매한 물품들 저장할 목록
		int sum = 0;	// 구매한 물품 가격 저장할 목록
		for(int i=0; i<cart.length; i++) {
			itemList += cart[i]+", ";
			sum += cart[i].price;
		}
		
		System.out.println("itemList : " + itemList);
		System.out.println("sum : " + sum);
		System.out.println("money : " + money);
		
	} //summary end
}

class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product{
	Tv() { super(100); }  //자신의 가격을 상위 클래스로 전달
	
	public String toString() { return "Tv"; }  // 호출되면 출력되게 함
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer";}
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}