
public class Day220412 {

	public static void main(String[] args) {
		//249p

		//�Լ��� �� �����?
		//������ ���ϰ� �ϱ�����, �ߺ�����, �ڵ带 ª�� �Ҽ��ְ�

		//�Լ��� �����ϸ� �ݵ�� �ٸ� ��(main���) ȣ���� �ؾ��Ѵ�.
		
		// 1) �Լ����� �Է�(X), ���(X)
//		System.out.println("main() �Լ�!!");
//		
//		sub();  //�Լ� ȣ�� ����
//		
//		System.out.println("main()2 �Լ�!!");
//	} // main �� ��
		// 1)
//	public static void sub() {
//		System.out.println("���� �Լ� �Դϴ�.");
//	} // sub �� ��
//		---------------------------------------
		// 2) �Լ����� �Է�(O), ���(X)
//		
//		double dnum = 2.5;
//		int num2 = 5;
//
//		System.out.println("main() �Լ�!!");
//		
//		sub(dnum,num2);  //�Լ� ȣ�� ����  --> ���ڰ�
//		
//		System.out.println("main()2 �Լ�!!");
//	} // main �� ��
		// 2) ���ڰ��� �Ű������� ���� Ÿ���� �Լ������Ѵ�.
//	public static void sub(double i, int j) {  // --> �Ű�����
//		System.out.println("�� ���� ���� " + (i + j) );
//	} // sub �� ��
//		----------------------------------------
		// 3) �Լ����� �Է�(X), ���(O)
//		
//		double dnum = 2.5;
//		int num2 = 5;
//
//		System.out.println("main() �Լ�!!");
//		
//		double n = sub();  //�Լ� ȣ�� ����  --> ���ڰ�
//		
//		System.out.println("��� ���� " + n);
//		
//	} // main �� �� 
//			
//	// 3)
//	//void �ڸ����� ��ȯ���� �´� --> void�� ��ȯ���� ���ٴ� ���� ���
//	//sub�� �Լ� �̸� --> �����̸� �߿��� ����Ѵ�.
//	public static double sub() {
//		
//		double dnum = 12.5;
//		
//		System.out.println("sub() �Լ�...");
//		
//		return dnum;
//	
//	} // sub �� ��
//	----------------------------------------------
		// 4) �Լ����� �Է�(O), ���(O)
		
		int n = 5;
		int n2 = 10;
		System.out.println("main() �Լ�!!");
		
		int result = sub(n, n2);
	
		System.out.println("��� ���� " + result);
	} // main �� ��
	
	public static int sub(int n, int n2) {

		System.out.println("sub() �Լ�...");
		
		return n*n2;
	} // sub �� ��

	
	
}
