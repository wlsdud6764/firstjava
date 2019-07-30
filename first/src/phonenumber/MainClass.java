package phonenumber;

import java.util.Scanner;


public class MainClass extends Friend  {
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	int choice2 = 0;
	Friend[] fAry = new Friend[10];
	Friend fr = new Friend();

	public static void main(String[] args) {
//		fAry[0] = new Friend("이창호", "1111");
//		fAry[1] = new UnivFriend("이창호","2222","영어");
//		fAry[2] = new ComFriend("이창호","2222","총무부");	
	}// void main

	void choice() {
		while (true) {
		

			System.out.println("선택하세요. 1)입력  2)종료");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1)
				System.out.println("분류를 선택하세요 1)친구 2)동료 3)대학동문 ");
			choice2 = sc.nextInt();
			if (choice == 1)
				fr.get(name, phone);
			
				else if (choice == 2)
					for (int i = 0; i < fAry.length; i++) {
						fr.
					} // for
			
				else if (choice2 == 3)
					for (int i = 0; i < fAry.length; i++) {
						if (fAry[i] == null)
						fAry[i] = new Friend(name, phone, major);
						break;
					} // for
			
			else if (choice == 2)
				for (Friend f : fAry) {
					if (f != null)
						f.showInfo();
				} // for
			else if (choice == 3)
				System.out.println("종료");

			else
				System.out.println("잘못선택하셨습니다");

		} // while

	}// choice

}// MainClass
