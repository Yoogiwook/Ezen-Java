package com.ezen;

import javax.net.ssl.HostnameVerifier;

public class CarTest {

	public static void main(String[] args) {
		
//		Sedan se = new Sedan();
//		se.setColor("red");
//		System.out.println(se.getColor());
//		
//		se.setPassenger(4);
//		System.out.println(se.getPassenger() + "명");
//		
//		Sedan se2 = new Sedan("blue",2,4,3);
//		System.out.println(se2.getColor());
//		System.out.println(se2.getPassenger() + "명");
//		
//		Sports sp = new Sports();
//		sp.setColor("white");
//		System.out.println(sp.getColor());
//		
//		Sports sp2 = new Sports("yellow", 2, 4, 1, 5000);
//		System.out.println(sp2.getColor()+","+sp2.getPassenger()+","+sp2.getTire()+","+sp2.getSeat()+","+sp2.getHorsePower());
//		sp2.run();
		Sports sp3 = new Sports();
	}

}

class Car{ //
	private int passenger;
	private int tire;
	private int seat;
	
	public Car() {
		System.out.println("Car");
	}
	public Car(int passenger, int tire, int seat) {
		System.out.println("Car() 생성자");
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	void run() {
		System.out.println("가즈아아아아아~~~!");
	}
	void stop() {}
}
class Sports extends Sedan{
	private int horsePower;
	
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public Sports() {
		System.out.println("Sports");
	}
	public Sports(String color, int passenger, int tire, int seat, int horsePower) {
		super(color,passenger,tire,seat);
		this.horsePower = horsePower;
	}
	void run() {
		System.out.println("스포츠카 가즈아아아아아~~~!");
	}
}
class Sedan extends Car{
	private String color;
	
	public Sedan() {
		System.out.println("Sedan");
	}
	public Sedan(String color, int passenger, int tire, int seat) {
		super(passenger,tire,seat);  //상위클래스 생성자에게 전달.. Car 생성자에게 전달   항상 맨 위에 위치해야함.
		System.out.println("Sedan() 생성자");
		this.color = color;
//		setPassenger(passenger);
//		setTire(tire);
//		setSeat(seat);
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void gas() {}
}

class Bus extends Car{
	int passengerCount;
	void passengerLoad() {}
}

class Truck extends Car{
	int load;
	void ObjectLoad() {}
}