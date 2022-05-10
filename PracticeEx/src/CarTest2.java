class Car{
	String color;
	String gearType;
	int door;
	
	Car(){ // 디폴트 생성자 
		this("White", "auto", 4); // 기본값 설정
	}
	
	Car(String color){ // color 값 받아주는 생성자
		this(color, "auto", 4); // this로 color 값 내려줌
	}
	
	Car(String color, String gearType, int door){ // 인자값 3개 받아주는 생성자
		this.color = color;			// 들어온 color 값을 받아서 저장
		this.gearType = gearType;	// 들어온 gearType 값을 받아서 저장
		this.door = door;			// 들어온 door 값을 받아서 저장
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();			//객체 생성
		Car c2 = new Car("blue");	//인자값을 가진 객체 생성(생성 하면서 초기화)
		
		System.out.println("c1의 color = " + c1.color + ", gearType = "+ c1.gearType + ", door = "+ c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = "+ c2.gearType + ", door = "+ c2.door);
	}

}
