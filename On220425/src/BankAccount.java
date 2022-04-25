//잔액 : 10000
//잔액 : 7000
public class BankAccount { //클래스 --> 클래스 설계는 추상화 개념
	
//	인스턴스변수(멤버변수) 원칙 : 외부에서 직접 접근 금지 (정보 은닉의 목적 중 무결성을 위한 것)
	private int balance; //잔액
	
	private int sum;
	
//	getter, setter -->get은 값 출력, set은 값 입력 시 사용.
	void setSum (int sum) {
		this.sum = sum;
	}
	
	int getSum() {
		return this.sum;
	}
	
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

class MainClass{
	public static void main(String[] args) {
//		System.out.println(); 문장 사용 금지
		
		BankAccount bank = new BankAccount();
//		
//		아래는 XXXXX!!!
//		bank.balance = 10000; //이거 아니아니아니됨!!!
//		bank.checkBalance();
//		
//		bank.withdraw(3000);
//		bank.checkBalance();
//		System.out.println("-----------------");
		
		BankAccount kim = new BankAccount();
		kim.deposit(10000);
		kim.checkBalance();
		kim.withdraw(3000);
		kim.checkBalance();
		System.out.println("-----------------");
		
		BankAccount park = new BankAccount();
		park.deposit(50000);
		park.checkBalance();
		park.withdraw(35000);
		park.checkBalance();
		System.out.println("-----------------");
		
		BankAccount lee = new BankAccount();
		lee.deposit(15000);
		lee.checkBalance();
		lee.withdraw(5000);
		lee.checkBalance();
		System.out.println("-----------------");
		
//		응용ver.
		lee = kim;//이거 단순히 변수를 넣는 개념이랑은 다름. 참조공간을 공유하겠다는 뜻으로 받아들여야 함.
		lee.checkBalance();
		lee.deposit(10000);
		kim.checkBalance();
		park.checkBalance();
		
//		getter setter
		bank.setSum(100); //입력담당 setter
//		bank.getSum(); //출력담당 getter
		System.out.println(bank.getSum()); //getter 시각화
	}
}
