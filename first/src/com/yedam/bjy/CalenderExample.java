package com.yedam.bjy;

import java.util.Calendar;
import java.util.Scanner;

public class CalenderExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
//		System.out.println("���ش�" +now.get(Calendar.YEAR));
//		System.out.println("�̹�����" +now.get(Calendar.MONTH));
//		System.out.println("������" +now.get(Calendar.DAY_OF_MONTH));
//		System.out.println("�̹��� ��������" +now.getActualMaximum(Calendar.DAY_OF_MONTH));
 //       System.out.println("������" +now.get(Calendar.DAY_OF_WEEK));
		now.set(2019,1,1);//�⺻���� 0���� �����ϴϱ� 1�����־���Ѵ�
//		System.out.println("���ش�" +now.get(1));
//		System.out.println("�̹�����" +now.get(Calendar.MONTH));
//		System.out.println("������" +now.get(Calendar.DAY_OF_MONTH));
		System.out.println("�̹��� ��������" +now.getActualMaximum(Calendar.DAY_OF_MONTH));//0���� �����ϴϱ� 1�����־���Ѵ�
//		System.out.println("������" +now.get(Calendar.DAY_OF_WEEK));

		int year;
		int month;
		
		System.out.println("�⵵�� �Է��ϼ���");
		year = sc.nextInt();

		System.out.println("���� �Է��ϼ���");
		month = sc.nextInt();
		System.out.println(year + "��" + month + "���� �޷�");
		
		now.set(year, month-1,1);//0���� �����ϴϱ� 1�����־���Ѵ�  //month = 2�̸� month-1 �� �ؼ� 1�� �迭�� �ִ� 2���� �޷��� ����Ѵ�
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
