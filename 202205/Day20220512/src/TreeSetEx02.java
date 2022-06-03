import java.util.TreeSet;

class Person1 implements Comparable<Person1>{
	String name;
	int age;
	
	public Person1() {}
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	@Override
	public int compareTo(Person1 o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
}

public class TreeSetEx02 {

	public static void main(String[] args) {
		
		TreeSet<Person1> tree = new TreeSet<Person1>();
		
		tree.add(new Person1("kim", 20));
		tree.add(new Person1("park", 50));
		tree.add(new Person1("Lee", 80));
		tree.add(new Person1("Lee", 80));
		tree.add(new Person1("Lee", 50));
		tree.add(new Person1("kim", 29));
		tree.add(new Person1("kim", 80));
		
		for(Person1 n : tree)
			System.out.println(n);
		
		
		
//		System.out.println("\n-------------------------");
//		Iterator<Person1> itr = tree.iterator();
//		while(itr.hasNext()) {
////			Integer n = itr.next();
////			System.out.print(n.toString() + "\t"); // 두 문장을 아래 한 문장으로 처리 가능
//			System.out.print(itr.next().toString() + "\t");
//		}
	}

}
