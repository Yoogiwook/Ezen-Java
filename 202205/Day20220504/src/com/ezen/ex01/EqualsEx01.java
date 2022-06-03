package com.ezen.ex01;

public class EqualsEx01 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) //서로 다른 객체를 참조하고 있기때문에 다르다.
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		
		v2 = v1; // 같은 객체를 참조하게 만듦
		
		if(v1.equals(v2)) // 같은 객체를 참조하기 때문에 같다.
			System.out.println("v1과 v2는 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}

}

class Value{
	int value;
	
	public Value(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) { // 원래 주소값을 비교하고있었는데 이 메서드가 들어가면서 내용을 비교함
		
		if(obj instanceof Value) { // 없어도 상관없음
			return value == ((Value)obj).value; // Value로 형변환 해줘야함 Object 타입이기 때문에 /얘만 있어도 똑같은 결과
		}
		return false; //없어도 상관없음
	}
}