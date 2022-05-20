import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Meber inner class 를 쓰는 이유는 외부에서 클래스 내에 접근하는것을 막기위해서 */

interface Printable{
	void print();
}
class Papers{
	private String con;
	public Papers(String s) { con = s; }
	public Printable getPrinter() { return new Printer2(); }
	
	private class Printer implements Printable {
		
		public void print() {
			System.out.println("흑백 : " + con);
		}

	}
	private class Printer2 implements Printable {
		
		public void print() {
			System.out.println("컬러 : " + con);
		}
		
	}
	
}
public class UsermemberEx1 {

	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();
		
		
		List<String> list = new ArrayList<>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { System.out.print(it.next() + " "); }
		
	}

}
