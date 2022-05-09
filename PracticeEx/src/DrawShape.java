public class DrawShape {

	public static void main(String[] args) {
		Point[] p = { new Point(100, 100),
					  new Point(140, 50),
					  new Point(200, 100)
		}; // 참조배열 p 생성
		
		Triangle t = new Triangle(p); // 객체 t 생성 인자값으로 p를 넘겨줌
		Circle c = new Circle(new Point(150, 150),50); // 인자값을 가진 객체를 생성
		
		t.draw();
		c.draw();
	}

}

class Shape{
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}

class Point{
	int x;
	int y;
	
	Point(){ // new Circle에서 생성된 값을 받아서 아래로 내려줌
		this(0,0);
	}
	
	Point(int x, int y){ // 내려받은 값을 저장함
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle extends Shape{
	Point center; //참조변수
	int r;
	
	Circle(){ // 생성한 객체의 인자값을 받아서 아래로 내려줌
		this(new Point(0,0), 100);
	}
	
	Circle(Point center, int r){ // 내려받은 인자값을 각각 저장
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{
	Point[] p = new Point[3];
	
	Triangle(Point[] p) { // 배열 p를 받아서 값을 저장함
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}