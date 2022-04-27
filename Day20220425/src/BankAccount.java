public class BankAccount {	//클래스 --> 클래스 설계는 추상화 개념을 이용해서 생성
	
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

class MainClass{
	public static void main(String[] args) {
		
		
		//아래 화면처럼 출력하기 위한 문장을 기술
		//System.out.println(); --> 문장 사용 금지
		BankAccount kim = new BankAccount(); //생성자 호출 --> 
													//현재는 디폴트 생성자 호출
		kim.deposit(10000);
//		bank.balance = 10000; --> 정보 은닉 불가능
		kim.checkBalance();
		
		kim.withdraw(3000);
		kim.checkBalance();
		System.out.println("----------------------");
		//park
		BankAccount park = new BankAccount();//계좌 개설
		park.deposit(30000);
		park.checkBalance();
		park.withdraw(15000);
		park.checkBalance();
		System.out.println("----------------------");
		
		//Lee
		BankAccount lee = new BankAccount();//계좌 개설
		lee.deposit(50000);
		lee.checkBalance();
		lee.withdraw(30000);
		lee.checkBalance();
		System.out.println("----------------------");
		
		System.out.println("----------------------");
		lee = kim;
		lee.checkBalance();
		lee.deposit(10000);
		kim.checkBalance();
		park.checkBalance();
	}
}

//잔액 : 10000
//잔액 : 7000