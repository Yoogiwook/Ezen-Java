package com.ezen;

public class Exam01 {

	public static void main(String[] args) {
//		animal an = new animal();
//		animal an2 = new Mammal();
//		animal an3 = new Person();
//		
//		an.eat();
//		an2.eat();
//		an3.eat();
//		System.out.println("---------------");
//		
////		Object ob = new Person(); //가능 하지만 쓸수 있는 함수가 몇 없음
//		
////		Mammal ma = new Person(); // 가능 Person 이 Mammal 를 상속받기떄문
////		ma.eat();
////		whale wh = new Person(); // 불가능 같은 라인이라서
////		wh.eat();
//		
//		Person p2 = new Person();
//		Person p3 = p2;
//		
////		상위 클래스에서 하위 클래스의 변수를 참조하려면 본인이 가지고 있는 변수만 참조 가능
//		an3.eat();
//		an3.run();
////		an3.play(); //본인이 가지고있지 않은 참조변수라 사용 불가능
//		
//		System.out.println("---------------");
//		Person p = (Person)an3; // Person 으로 형변환 하여 play 참조변수도 사용가능
//		p.eat();
//		p.run();
//		p.play();
//		
//		Object obj = new Person();
//		Person p4 = (Person)obj;
//		p4.eat();
		
		animal animal = new Penguin();
//		animal.eat();
//		animal.play();
		
		if( animal instanceof Birds) { //animal 이 참조하고있는 변수가 펭귄, 참새면 Birds 로 형변환
			Birds birds = (Birds)animal;
		}
		else if( animal instanceof Mammal) { //animal 이 참조하고있는 변수가 사람, 고래면 Mammal로 형변환
			Mammal mammal = (Mammal)animal;
		}
		
//		Person person = (Person)animal;
//		person.eat();
		
	}

}

class animal{ //동물
	void eat() {
		System.out.println("동물이 먹는다");
	}
	void run() {
		System.out.println("동물이 달린다");
	}
}
class Mammal extends animal{ //포유류
	void eat() {
		System.out.println("포유류가 먹는다");
	}
	
}
class Whale extends Mammal{ //고래
	void eat() {
		System.out.println("고래가 먹는다");
	}
}
class Person extends Mammal{ //사람
	void eat() {
		System.out.println("사람이 먹는다");
	}
	void run() {
		System.out.println("사람이 달린다");
	}
	void play() {
		System.out.println("사람이 논다");
	}
}
class Birds extends animal{ //조류
	void eat() {
		System.out.println("조류가 먹는다");
	}
}
class Penguin extends Birds{ //펭귄
	void eat() {
		System.out.println("펭귄이 먹는다");
	}
	void play() {
		System.out.println("펭귄이 논다");
	}
}
class Sparrow extends Birds{ //참새
	void eat() {
		System.out.println("참새가 먹는다");
	}
}