package com.ezen01;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");
		
		while(st.hasMoreTokens()) {  //데이터가 있으면 계속 돌고 없으면 멈춤
			System.out.println(st.nextToken());
		}
	}

}
