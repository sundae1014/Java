package sub4;

public class Account {
	
	// 속성
	protected String id;
	protected String bank;
	protected String name;
	protected int balance;	
	
	public Account(String bank, String id, String name, int balance) {
		this.id = id;
		this.bank = bank;
		this.name = name;
		this.balance = balance;
	}
	
	// 기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdarw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("------------------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : "+ this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("-------------------------------");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	
}
