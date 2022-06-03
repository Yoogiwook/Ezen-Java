import java.util.ArrayList;

class Fruit{
	@Override
	public String toString() { return "Fruit"; }
}
class Apple3 extends Fruit{
	@Override
	public String toString() { return "Apple"; }
}
class Grape extends Fruit{
	@Override
	public String toString() { return "Grape"; }
}
class Toy{
	@Override
	public String toString() { return "Toy"; }
}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		Box3<Fruit> fruitBox = new Box3<Fruit>();
		Box3<Apple3> appleBox = new Box3<Apple3>();
		Box3<Toy> toyBox = new Box3<Toy>();
//		Box3<Grape> grapeBox = new Box3<Apple3>(); // 에러. 타입 불일치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple3());
		
		appleBox.add(new Apple3());
		appleBox.add(new Apple3());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
		
	}

}

class Box3<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i)   	 { return list.get(i); }
	int size() 		 { return list.size(); }
	@Override
	public String toString() { return list.toString(); }
}
	