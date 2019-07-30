package com.yedam.bjy;

public class Calculator {
	static final double pi =3.14;//static final선언후 변할수없음, 선언한 변수는 한번만 사용할수있음
	static double multi(double x, double y) {//static선언하면 클래스내에서 재선언이 필요없고 값은 변할수있음
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
		System.out.println("결과값은 " + result);
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
