
public class BankAccount2 { //클래스 --> 클래스 설계는 추상화 개념
	
//	인스턴스변수(멤버변수) 원칙 : 외부에서 직접 접근 금지 (정보 은닉의 목적 중 무결성을 위한 것)
	private int balance; //잔액
	
	int deposit (int amount) { //입금
		
		if(amount < 0) return 0;
		
		balance += amount;
		return balance;
	}
	
	int withdraw (int amount) { //출금
		balance -= amount;
		return balance;
	}
	
	void checkBalance () { //잔고 확인
		System.out.println("잔액 : " + balance);
	}
}

class MainClass2{
	public static void main(String[] args) {
		
		BankAccount2[] bank = new BankAccount2[3];
		bank[0] = new BankAccount2();
		bank[1] = new BankAccount2();
		bank[2] = new BankAccount2();
		
		bank[0].deposit(10000);
		bank[0].withdraw(3000);
		bank[0].checkBalance();
	}
}
