import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx02 {

	public static void main(String[] args) {
		 ArrayList original = new ArrayList(10);
		 ArrayList copy1 	= new ArrayList(10);
		 ArrayList copy2 	= new ArrayList(10);
		 
		 for(int i=0; i<10; i++)
			 original.add(i+""); //original에 0~9까지 문자열로 입력
		 
		 Iterator it = original.iterator();
		 
		 while(it.hasNext())
			 copy1.add(it.next()); // copy1에 it 값을 입력
		 
		 System.out.println("= Original에서 copy1로 복사(copy) =");
		 System.out.println("original: "+ original);
		 System.out.println("copy1: "+ copy1);
		 System.out.println();
		 
		 it = original.iterator(); // Iterator는 재사용이 안되기 때문에 다시 호출
		 
		 while(it.hasNext()) {
			 copy2.add(it.next());
			 it.remove();
		} //end while	
		 
		 System.out.println("= Original에서 copy2로 이동(move) =");
		 System.out.println("original: "+ original);
		 System.out.println("copy2: "+ copy2);
	} //end main

}
