public class CarTest {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
		se.color = "white";
		se.passenger = 5;
		se.tire = 4;
		System.out.println(se.color+","+se.passenger+","+se.tire);
		
		Bus bu = new Bus();
		bu.passenger = 15;
		bu.tire = 6;
		System.out.println(bu.passenger+","+bu.tire);
		
	}

}
class Car {
	int passenger;
	int tire;
	int seat;
	void run() {}
	void stop() {}
}

class Sedan extends Car{
	String color;
}

class Bus extends Car{
	void passengerLoad() {}
}

class Truck extends Car{
	void objectLoad() {}
}