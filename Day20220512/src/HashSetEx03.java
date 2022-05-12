import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Car{
	
	private String model;
	private String color;
	private int price;
	
	public Car() {}
	public Car(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return model + "-" + color + "-" + price+ ",";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, color, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		String m = ((Car)obj).model;
		String c = ((Car)obj).color;
		int p = ((Car)obj).price;
		//셋 다 같은 식임
//		if(this.model == ((Car)obj).model && this.color == ((Car)obj).color && this.price == price )
//		if( model.equals(m) && color.equals(c) && price = p )
//		return true;
//		else
//			return false;
		return model.equals(m) && color.equals(c) && price == p ? true : false;
			
	}
}
// Hashset은 중복X, 순서X
public class HashSetEx03 {

	public static void main(String[] args) {
		
		Set<Car> set = new HashSet<Car>();
		
		set.add(new Car("Y201", "red",100));
		set.add(new Car("Y202", "black",200));
		set.add(new Car("Y201", "red",300));
		set.add(new Car("Y201", "white",400));
		set.add(new Car("Y203", "black",500));
		// 사용자가 직접 클래스를 만들고 생성자를 이용해 값을 넣으면 중복 제거가 안됨
		// 중복제거를 하기 위해서는 사용자가 직접 hashCode와 equals를 오버라이딩해서 제거 해줘야함
		System.out.println("cnt : " + set.size());
		
		for( Iterator<Car> itr =  set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
	}

}
