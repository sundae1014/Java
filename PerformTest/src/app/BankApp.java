package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
	
	private List<Account> accounts = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
		
		
		System.out.println("프로그램 종료");
	}
	
	public void start() {
		
		boolean running = true;
		
		while(running) {
			printMenu();
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice){
				case 1 -> createAccount();
				case 2 -> listAccount();
				case 3 -> depositAccount();
				case 4 -> withdrawAccount();
				case 5 -> {
					running = false;
				}
				default -> System.out.println("올바른 번호를 선택하세요.");
			}
			
		}
		
	}
	
	public void printMenu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("---------------------------------------------------");
	}
	
	public void createAccount() { // 계좌생성		
		System.out.println("----------------- 계좌생성 --------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		
		Account ac = new Account(ano, owner, balance);
		accounts.add(ac);
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	public void listAccount() { // 계좌목록
		System.out.println("----------------- 계좌목록 --------------------------");
		
		for(Account ac : accounts) {
			System.out.println(ac.getAno() + " "+ac.getOwner()+" "+ac.getBalance());
		}
		
	}
	
	public void depositAccount() { // 입금
		System.out.println("-------------------- 예금 --------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Account ac = findAccount(ano);
		
		System.out.print("예금액: ");
		int addmoney = scanner.nextInt();
		scanner.nextLine();
		
		if(ac == null) {
			System.out.println("결과: 계좌가 없습니다.");	
			return;
		}
		
		ac.setBalance(ac.getBalance()+addmoney);
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	public void withdrawAccount() { // 출금
		System.out.println("-------------------- 출금 --------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Account ac = findAccount(ano);
		
		System.out.print("예금액: ");
		int minmoney = scanner.nextInt();
		scanner.nextLine();
		
		if(ac == null) {
			System.out.println("결과: 계좌가 존재하지 않습니다.");		
			return;
		}
		
		ac.setBalance(ac.getBalance()-minmoney);
		
		System.out.println("출금이 성공되었습니다.");
	}
	
	public Account findAccount(String ano) { // 계좌검색
		
		for (Account ac : accounts) {
	        if (ac.getAno().equals(ano)) {
	            return ac;
	        }
	    }
	    return null;
	}
}
