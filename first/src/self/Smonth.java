package self;
import java.util.Scanner;

public class Smonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month;
		System.out.println("달을 입력하세요");
		month= sc.nextInt();
		int Firstdate = getFirstdate(month);
		int Lastday = getLastday(month);
		
		
		
		System.out.println(month +"월달의 마지막 날은: " + getLastday(month));
		
		String[]  strAry = {"sun","mon","tue","wed","thu","fri","sat"};
		
		for (String str : strAry) {
			System.out.printf(str + " ");
		}
		System.out.println();
		
		
		for (int i =1; i<Firstdate; i++) {
			System.out.print("    ");
		}

		for (int i =1; i<=Lastday; i++) {
			System.out.printf("%3d ", i);
			if((i+Firstdate-1) % 7 ==0)
					
				System.out.println();
		}

	}

	static  int getLastday (int month) {
		 switch ( month) {
		case 1: case 3: case 5: case 7:  case 12: case 8:
			return 31;
		case 4: case 6: case 9: case 10: case 11:
			return 30;
		case 2:
			return 28;

		default:
			return 0;
		}
	 }
	static  int getFirstdate (int month) {
		 switch (month) {
		case 7: 
			return 2; // 월요일
		case 8: 
			return 5;
		case 9:
			return 1;

		default:
			return 0;
		}
	 }
}
	