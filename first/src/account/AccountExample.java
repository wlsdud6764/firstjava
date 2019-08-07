package account;

import java.util.Scanner;

import com.yedam.bjy.Account;



public class AccountExample {
	Scanner sc = new Scanner(System.in);
	Account[] acntAry = new Account[5];
	int menu = 0;
	Account acnt3 = null;
	
void execute() {
		while (true) {

			System.out.println("메뉴를 선택하세요. 1)신규  2)입금  3)출금  4)잔액  5)조회 6)종료");
			menu = sc.nextInt();
			sc.nextLine();
				if (menu == 1) 
					creat();
			    else if (menu == 2)  
			    	deposit();
			    else if (menu == 3) 
			    	withdraw();
			    else if (menu == 4) 
			    	checkBalance();
				else if (menu == 5)
					allAccount();
				else if (menu == 6)
					exit();
				else
			 	System.out.println("잘못선택하셨습니다");
			
			
//							
		} // wile
	}// excute
	
	void creat() {
		
			System.out.println("신규");
			System.out.println("계좌번호를 입력하세요.");
			String accNo = sc.nextLine();
			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();
			System.out.println("금액을 입력하세요.");
			int balance = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < acntAry.length; i++) {
				if (acntAry[i] == null)
					acntAry[i] = new Account(accNo, name, balance);
				break;

			}//for
	}//1번 메소드
	
	void  deposit() {
			
				System.out.println("입금");
				System.out.println("계좌를 입력하세요");
				String accNo = sc.nextLine();
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i].getAccountNo().equals(accNo)) {
						System.out.println("입금금액을 입력하세요.");
						int money = sc.nextInt();
						sc.nextLine();
						for (i = 0; i < acntAry.length; i++) {
							if (acntAry[i] != null && acntAry[i].getAccountNo().equals(accNo)) {
								acntAry[i].deposit(money);
								break;
							} // if
						} // for

					} // if
					else
						System.out.println("계좌를 잘못입력하셨습니다");
					break;
				} // for
			} //2번 메소드

	 
	 void withdraw() {
			System.out.println("출금");
			System.out.println("계좌를 입력하세요");
			String accNo = sc.nextLine();
			System.out.println("출금금액을 입력하세요.");
			int money = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < acntAry.length; i++) {
				if (acntAry[i] != null && acntAry[i].getAccountNo().equals(accNo)) {
					acntAry[i].withdraw(money);
					break;
				} // if
			} // for닫음
		}//3번 메소드 닫음
	 
	 void checkBalance() {
			System.out.println("잔액");
		}//4번메소드

	 void allAccount() {
			System.out.println("조회");
			for (int i = 0; i < acntAry.length; i++) {
				if (acntAry[i] != null)
					acntAry[i].checkBalance();
			}//for
		}//5
	 
	 void exit() {
		 System.out.println("종료");
	 }
	 
	
}// class
