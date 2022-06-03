
public class Test {
	public static void main(String[] args) {
		A a = new D('ㄱ');
		if(a instanceof D) {
			D dd = (D)a;
		}

	}
}

class A{
	private int a;
	private int b;
	public A() {}
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class B extends A{
	private String c;
	public B() {}
	public B(int a, int b, String c) {
		super(a,b);
		this.c = c;
	}
}

class D extends B{
	private char d;
	public D() {}
	public D(char a) {
		this.d = a;
	}
	public D(int a, int b, String c, char d) {
		super(a,b,c);
		this.d = d;
	}
}

class F extends B{
	private double e;
}

class C extends A{
	
}