import java.util.Arrays;
import java.util.Scanner;

public class Day220413 {

	public static void main(String[] args) {  //jvm�� ȣ��
		// �Է�(X), ���(O)
//		add(); // �Լ� ȣ��
//		
//		System.out.println("���α׷� ����");
//	}
//	
//	// 			void(��ȯ��) add(�Լ��̸�)
//	public static void add() {    // ---> �Լ� ����, �Լ� ��ü
//	
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//			
//		System.out.println("�� �� ���� : " + (num1+num2));
//		
//	}
//	----------------------------------------------------	
		// �Է�(O), ���(X)
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		add(num1, num2);
//		
//		System.out.println("���α׷� ����");
//	}
//	
//	public static void add(int num1, int num2) {
//	
//		System.out.println("�� �� ���� : " + (num1+num2));
//	}
		
//	--------------------------------------------------
	// �Է�(O), ���(O)
//		Scanner sc = new Scanner(System.in);
//	
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//	
//		int result = add(num1, num2);
//	
//		System.out.println("�� �� ���� : " + result);
//		System.out.println("���α׷� ����");
//	}
//
//	public static int add(int num1, int num2) {
//
//		return num1+num2;
//	}
//	----------------------------------------------------
	// �Է�(X), ���(O)
//		double result = add();
//	
//		System.out.println("�� �� ����� : " + result);
//		System.out.println("���α׷� ����");
//}
//
//	public static double add() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//	
//		return (num1+num2)/2.0;
//	}
//	-----------------------------------------------------
//		���� 5-1
//		int[] score = new int[5];
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70;	// score[2] = 70
//		score[3] = 80;
//		score[4] = 90;
//		
//		int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4]
//		
//		// for ������ �迭�� ��� ��Ҹ� ����Ѵ�.
//		for(int i=0; i<score.length; i++) { //score.length �� �̿��ϸ� ����
//			System.out.printf("score[%d]:%d%n", i, score[i]);
//		}
//		System.out.printf("tmp:%d%n", tmp);
//		
//		System.out.printf("score[%d]:%d%n", 7, score[7]); 
//		// �� ���� index ������ ��� ��
//	---------------------------------------------------------
//		���� 5-2
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
////		int[] iArr3 = new int[]{100, 95, 80, 70 ,60};		
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for(int i=0; i<iArr1.length; i++) {
//			iArr1[i] = i+1;
//		}
//		for(int i=0; i<iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*10)+1;
//		}
//		for(int i=0; i<iArr1.length; i++) {
//			System.out.print(iArr1[i]+",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2)); // for ���� ��������ʰ��� 
//		System.out.println(Arrays.toString(iArr3)); // ����Ǿ��ִ� ��ü 
//		System.out.println(Arrays.toString(chArr)); // ���� ��°���
//		System.out.println(iArr3); // iArr3 �� �ּҰ��� ��µ�
//		System.out.println(chArr); // ĳ���Ͱ��� �����ϰ� ���� ��µ�

//	-------------------------------------------------------------
//		�迭�� ����
//		int[] iArr1 = new int[5]; // iArr1 ���� 5ĭ -> 10ĭ���� Ȯ��
//		
//		int[] tmp = new int[iArr1.length*2];
//		
//		for(int i=0; i<iArr1.length; i++) {
//			iArr1[i] = (int)(Math.random()*10)+1;
//		}
//		
//		System.out.println(Arrays.toString(iArr1));
//		
//		for(int i=0; i<iArr1.length; i++)
//			tmp[i] = iArr1[i];
//		
//		iArr1 = tmp;
//		
//		System.out.println(Arrays.toString(iArr1));
		
//	-------------------------------------------------------------
//		�迭�� ���� �ǽ� // double Ÿ�� �� 10 -> 20���� �ø���
//		double[] dArr = new double[10];
//		
//		for(int i=0; i<dArr.length; i++) 
//			dArr[i] = (Math.random());
//		
//		for(int i=0; i<dArr.length; i++) 
//			System.out.printf("%.2f%n", dArr[i]);
//		
//		double[] tmp = new double[dArr.length * 2];
//
//		for(int i=0; i<dArr.length; i++) 
//			tmp[i] = dArr[i];
//		
//		dArr = tmp;
//		System.out.println("----------------------------");
//		for(int i=0; i<dArr.length; i++) 
//			System.out.printf("%.2f%n", dArr[i]);
		
//	-------------------------------------------------------------
//		���� 5-4
//		char[] abc = {'A', 'B', 'C', 'D'};
//		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		System.out.println(abc);
//		System.out.println(num);
//		
//		//�迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
//		char[] result = new char[abc.length+num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result);
//		
//		//�迭 abc�� �迭 num�� ù ��° ��ġ���� �迭 abc�� ���̸�ŭ ����
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		
//		// num�� index6 ��ġ�� 3���� ����
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
//	-------------------------------------------------------------
//		int[] abc = {10,20,30,40,50};
//		int[] abc2 = {1,2,3,4,5,6,7,8,9,};
////		int[] abc2 = {1,2,30,40,50,6,7,8,9};
//	
//		System.out.println(Arrays.toString(abc));
//		System.out.println(Arrays.toString(abc2));
//		
//		System.arraycopy(abc, 2, abc2, 2, 3);
//		System.out.println(Arrays.toString(abc2));
		
//	-------------------------------------------------------------
		//������ �迭 5�� ����
		//�ʱ�ȭ�� �����Լ� ���ؼ� 1~100 ���̰��� ���� �� ���
		//�ִ밪
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++)
			num[i] = (int)(Math.random()*99)+1;
		
		System.out.println("�⺻ : " + Arrays.toString(num));
		
		//�ִ밪 �� �ּҰ� ��� �� ���
		
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i<num.length; i++) {

			if(max < num[i])
				max = num[i];

			if(min > num[i])
				min = num[i];
		} 
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		//Sort(����) - ��������
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++)
				if(num[i]>num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
				
		}
		System.out.println("�������� ���� : " + Arrays.toString(num));
	
		//�������� ����
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++)
				if(num[i]<num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
		}
		System.out.println("�������� ���� : " + Arrays.toString(num));
		
		// ���� �̻����δ�.
//		for(int i=0; i<num.length-1; i++) {
//			for(int j=i+1; j<num.length; j++)
//				if(num[i]<num[j]) {
//					int tmp = num[i];
//					num[i] = num[j];
//					num[j] = tmp;
//			}
//		}
	}
}