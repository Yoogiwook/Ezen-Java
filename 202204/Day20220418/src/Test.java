
public class Test {

	public static void main(String[] args) {
		int mul = 0;
		
		for(int i=1; i<4; i++) {  
			for(int j=1; j<4; j++) { //0, 1, 2
				mul = i * j;
				System.out.printf("%d ", mul);
			}
		System.out.println();
		}
	}

}
