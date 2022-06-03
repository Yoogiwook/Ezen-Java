public class BankAccount2 {	//클래스 --> 클래스 설계는 추상화 개념을 이용해서 생성
	
	private int balance; //잔액 멤버변수, 인스턴스변수, 원칙 : 변수는 외부에서 직접 접근을 금지,
											// 정보은닉 목적 중 무결성
	
	
	int deposit(int amount)	{ 	//입금
		balance += amount;
		
		return balance;
	}

	int withdraw(int amount) { 	//출금
		balance -= amount;
		return balance;
	}
	
	void checkBalance() {	//잔고 확인
		System.out.println("잔액 : " + balance);
	}
}

class MainClass2{
	public static void main(String[] args) {
		
		//객체 배열
		BankAccount2[] bank = new BankAccount2[3];
		
		bank[0] = new BankAccount2();
		bank[1] = new BankAccount2();
		bank[2] = new BankAccount2();
		
		bank[0].deposit(10000);
		bank[0].withdraw(3000);
		bank[0].checkBalance();
	}
}

//잔액 : 10000
//잔액 : 7000