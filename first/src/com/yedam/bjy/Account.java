package com.yedam.bjy;

public class Account {
	 private String name;
	 private String accountNo;
	 private  int balance;
	
	 public Account(String accountNo,String name, int balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	void deposit(int money) {
		this.balance +=money;
	}
	void withdraw(int money) {
		this.balance -=money;
	}
	void checkBalance() {
		System.out.println("계좌번호" + this.accountNo + "잔액은" +this.balance);
	}
	public String getName() {
		return name;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}

	
}
