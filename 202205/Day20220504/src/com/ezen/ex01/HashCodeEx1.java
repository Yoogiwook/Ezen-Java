package com.ezen.ex01;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		Value2 v1 = new Value2(10);
		Value2 v2 = new Value2(10);
		
	}

}

class Value2 {
	int value;
	
	Value2(int value){
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		return value == ((Value2)obj).value;
	}
}