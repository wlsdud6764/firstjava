package yedam;

import java.util.Scanner;

public class ReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sum(3,5);
//		int result =sum2(3,5);
//		double avgl = avg(3,6);
//		System.out.println("sum2: " + result);
//		System.out.println("avg: " + avgl);
		Scanner sc = new Scanner(System.in);
	
		int month=8;
		int dayofFirstdate = getFirstdate(month);
		int dateofLast = getLastday(month);
		System.out.println("달을 입력하세요");
		month= sc.nextInt();
		
		System.out.println(month +"월달의 마지막 날은: " + getLastday(month));
		
		String[]  strAry = {"sun","mon","tue","wed","thu","fri","sat"};
		
		for (String str : strAry) {
			System.out.printf(str + " ");
		}
		System.out.println();
		
		
		for (int i =1; i<dayofFirstdate; i++) {
			System.out.print("    ");
		}

		for (int i =1; i<=dateofLast; i++) {
			System.out.printf("%3d ", i);
			if((i+dayofFirstdate-1) % 7 ==0)
					
				System.out.println();
		}

	}
//	static  void sum (int x, int y) {
//		 System.out.println("sum: " + (x+y));
//	 }System.out.println("잘못입력하셨습니다")
//	static  int sum2 (int x, int y) {
//		 return x+y ;
//	 }
//	
//	static  double avg (int x, int y) {
//		 return (double) (x+y)/2 ;
//	 }
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
