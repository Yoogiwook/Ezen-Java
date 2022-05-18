package com.ezen.ex06;

public class MakeThreadMultiEx01 {

	static int num=1;
	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			try {
				for(int i=1; i<10; i++) {
					num *= i;
					Thread.sleep(1000);
					}
			}catch( Exception e) {
				e.printStackTrace();
			}
		};

		Runnable task2 = () -> {
			try {
				for(int i=1; i<10; i++) {
					num /= i;
					Thread.sleep(1000);
					}
			}catch( Exception e) {
				e.printStackTrace();
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	}

}
