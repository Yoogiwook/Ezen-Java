package com.ezen.ex06;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + " 입니다.");
	}

}

class ThreadEx7_1 extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
				
			}catch(Exception e) {}
		}
	}
}