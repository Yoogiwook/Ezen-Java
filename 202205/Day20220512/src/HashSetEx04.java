import java.util.HashSet;
import java.util.Objects;

public class HashSetEx04 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
	}

}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}
@Override
public int hashCode() {
	return Objects.hash(name,age);
	}

@Override
public boolean equals(Object obj) {
	String name;
	int age;
	
	return this.name == ((Person)obj).name && this.age == ((Person)obj).age ? true : false;
	}
}