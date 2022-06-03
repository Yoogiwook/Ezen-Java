//아래는 도형을 정의한 Shape 클래스이다. 이 클래스를 조상으로 하는 Circle 클래스와
//Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야한다
//(1) 클래스명   : Circle
//	조상클래스 : Shape
//	멤버변수   : double r -반지름
//	
//(2) 클래스명	: Rectangle
//	조상클래스 : Shape
//	멤버변수	: double whidth - 폭
//			  double height - 높이
//	메서드	: 
//	  1. 메서드명 : isSquare
//	  	 기   능 : 정사각형인지 아닌지를 알려준다.
//	  	 반환타입 : boolean
//	  	 매개변수 : 없음

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point{
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y){
	this.x = x;
	this.y = y;
	}


public String toString() {
	return"["+x+","+y+"]";
	}
}

class Circle extends Shape{
	double r;   //반지름
	public Circle() {}
	public Circle(double r) {
		this.r = r;
	}
	
	public Circle(Point p, double r) {
		this.r = r;
	}
	
	@Override
	double calcArea() { // 원 면적 구하는 식
		return Math.PI * r * r;
	}
}

class Rectangle extends Shape{
	double width;  //폭
	double height; //높이
	
	public Rectangle() {
		this(new Point(0,0),0,0);
	}
	
	public Rectangle(double width , double height) {
//		this.width = width;
//		this.height = height;
		this(new Point(0,0),width,height);
	}
	
	public Rectangle(Point p, double width , double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() { //정사각형인지 아닌지 알려주는 식
		if( width == height && width !=0 && height !=0 ) 
			return true;
		else
			return false;
	}
	@Override
	double calcArea() { //사각형의 넓이 구하는 식
		return width * height;
	}
	
}

public class Exercise7_22{
	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s2 = new Circle(new Point(10,10), 5);
		Shape s3 = new Circle(5);
		System.out.println(s3.calcArea());
		
		Shape r = new Rectangle();
		Shape r2 = new Rectangle(150,50);
		Shape r3 = new Rectangle(new Point(100,100), 150, 50);
		System.out.println(r3.calcArea());
		
	}
}
