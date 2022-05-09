class Data{ int x; }
public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data(); // Data 객체 생성
		d.x = 10; // x(0x10)에 10 저장
		System.out.println("main() : x = " + d.x);
		
		change(d); //함수 change 호출 객체 d의 주소값(0x10)을 change에 보내줌 
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) { // 참조형 매개변수
		d.x = 1000; // x(0x10)에 1000 저장
		System.out.println("change() : x = "+ d.x);
	}
}
