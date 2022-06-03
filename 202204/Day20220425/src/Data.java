class Data1 {int x;}

public class Data {

	public static void main(String[] args) {
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = "+ x);
	}
}


//인스턴스 변수, 메소드는 객체가 생성되야 사용가능
//인스턴스 변수 및 메소드는 사용 가능 대상이 인스턴스 변수 인스턴스 메소드와
									//클래스 변수, 클래스 메소드 접근 가능
//클래스 변수와 클래스 메소드는 객체 생성 전 method area 영역에 생성됨, 따라서 클래스변수 메소드는
//생성되지 않은 인스턴스 변수, 인스턴스 메소드 접근 불가
