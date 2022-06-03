
public class Ex01 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		Car1 c3 = new Car1();
		c1.num++;
		c2.num +=2;
		c3.num +=5;
		System.out.println("c1 : " + c1.num);
		System.out.println("c2 : " + c2.num);
		System.out.println("c3 : " + c3.num);
		
		Car1 c4 = new Car1();
		c4.func();
		
		Car2 c10 = Car2.getInstanse();
		
		c10.num++;
		System.out.println("c1 : " + c1.num);
		
		Car2 c11 = Car2.getInstanse();
		c11.num++;
		System.out.println("c11 : " + c11.num);
		System.out.println("c10 : " + c10.num);
	}

}

class Car1{
	int num=10;
	public Car1() {}

	void func() {
		System.out.println("func");
	}
}

class Car2{		// 디자인패턴 >> 싱글톤

	private static Car2 car2 = null; // 참조변수 생성
	
	int num = 100;
	
	private Car2() {
		System.out.println("car2 생성자");
	}
	
	public static Car2 getInstanse() {
		if(car2==null)
			car2 = new Car2();		//생성자 호출
		return car2;
	}
}