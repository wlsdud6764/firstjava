package com.yedam.bjy;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
//		System.out.println("올해는" +now.get(Calendar.YEAR));
//		System.out.println("이번달은" +now.get(Calendar.MONTH));
//		System.out.println("오늘은" +now.get(Calendar.DAY_OF_MONTH));
//		System.out.println("이번달 마지막은" +now.getActualMaximum(Calendar.DAY_OF_MONTH));
 //       System.out.println("요일은" +now.get(Calendar.DAY_OF_WEEK));
		now.set(2019,1,1);//기본값이 0부터 시작하니깐 1을빼주어야한다
//		System.out.println("올해는" +now.get(1));
//		System.out.println("이번달은" +now.get(Calendar.MONTH));
//		System.out.println("오늘은" +now.get(Calendar.DAY_OF_MONTH));
		System.out.println("이번달 마지막은" +now.getActualMaximum(Calendar.DAY_OF_MONTH));//0부터 시작하니깐 1을빼주어야한다
//		System.out.println("요일은" +now.get(Calendar.DAY_OF_WEEK));

		int year;
		int month;
		
		System.out.println("년도를 입력하세요");
		year = sc.nextInt();

		System.out.println("달을 입력하세요");
		month = sc.nextInt();
		System.out.println(year + "년" + month + "월의 달력");
		
		now.set(year, month-1,1);//0부터 시작하니깐 1을빼주어야한다  //month = 2이면 month-1 을 해서 1번 배열에 있는 2월달 달력을 출력한다
		int firstdate= now.get(Calendar.DAY_OF_WEEK);
		int endday = now.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		String[] strAry = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
		for (String str : strAry) {
			System.out.printf(str + " ");
		} System.out.println();
		
		
		for (int i =1; i<firstdate; i++) {
			System.out.print("    ");
		}

		for (int i =1; i<=endday; i++) {
			System.out.printf("%3d ", i);
			if((i+firstdate-1) % 7 ==0)	
				System.out.println();
		}

	
		
			}
	
}
