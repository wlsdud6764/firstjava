package com.yedam.bjy;

public class Calculator {
	static final double pi =3.14;//static final������ ���Ҽ�����, ������ ������ �ѹ��� ����Ҽ�����
	static double multi(double x, double y) {//static�����ϸ� Ŭ���������� �缱���� �ʿ���� ���� ���Ҽ�����
		return x*y;
	}
	
	
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
		}
	
	
	double avg(int x,int y) {
		int sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	
	void println(String message){
		System.out.println(message);
	}
	
	
	void execute() {
		double result = avg(7,10);
		System.out.println("������� " + result);
	}
	
	
	 double areaRectangle(int w,int h) {
		 double result =w*h; 
		return result;
	}
	 
	 
	 double areaRectangle(int w) {
		 double result =w*w; 
		return result;
	}

}
