package Practice.no20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner (System.in);
	private static int num = 0;

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
	}
	
	private static void createAccount() {
		
		String ano;
		String owner;
		int balance;
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호 : ");
		scanner.nextLine();
		ano = scanner.nextLine();
		
	
		System.out.print("계좌주 : ");
		owner = scanner.nextLine();
		
		
		System.out.print("초기입금액 : ");
		balance = scanner.nextInt();
		scanner.nextLine();
		
		Account account = new Account(ano, owner, balance);
		accountArray[num] = account;
		if(accountArray[num] !=null) {
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
		num ++;
		
	}
	
	private static void accountList() {
		
		for(int i=0; i<num; i++) {
			System.out.println(accountArray[i].getAno() + "\t\t" + accountArray[i].getOwner() + "\t\t" + accountArray[i].getBalance());;
		}
	}
	
	private static void deposit() {
	
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		scanner.nextLine();
		String ano = scanner.nextLine();
		
		
		if(findAccount(ano) == null) {
			System.out.println("없습니다.");
		}else {
			System.out.print("예금액 : ");
			int balance = scanner.nextInt();
			findAccount(ano).setBalance(balance + findAccount(ano).getBalance());
			System.out.println("결과 : 출금이 성공되었습니다.");
		}
		
	}
	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		scanner.nextLine();
		String ano = scanner.nextLine();
		
		
		if(findAccount(ano) == null) {
			System.out.println("없습니다.");
		}else {
			System.out.print("예금액 : ");
			int balance = scanner.nextInt();
			if(findAccount(ano).getBalance() - balance > 0) {
				
				findAccount(ano).setBalance(findAccount(ano).getBalance()- balance);
				System.out.println("결과 : 출금이 성공되었습니다.");
			}else {
				System.out.println("너무 많이 출금한다.");
			}
			
		}
		
		
	}
	
	private static Account findAccount(String ano) {
		Account findAccount = null;
		for(int i=0; i<num; i++) {
			if(ano.equals(accountArray[i].getAno())) {
				
				findAccount = accountArray[i];
				break;
			}
		}
		return findAccount;
	}

}
