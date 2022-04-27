
public class Ex02 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.num++;
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		
		Car2 c10 = Car2.getInstance(); // 객체 생성 전 클래스를 호출
		
		c10.num++;
		System.out.println(c10.num);
		
		Car2 c11 = Car2.getInstance();
		c11.num++;
		System.out.println(c11.num); //c11, c10 두 변수는 같은곳을 참조함
		System.out.println(c10.num);
	}
}
class Car{
	int num = 10;
	public Car() {}
}

class Car2{
	private static Car2 car2 = null;
	
	int num = 100;
	
	private Car2() {}
	
	public static Car2 getInstance() {
		if(car2 == null)
			car2 = new Car2();  // 생성자 호출
		return car2;
	}
}